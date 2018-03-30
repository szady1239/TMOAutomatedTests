package pl.execon.tmo.main.java.utils;

import org.apache.commons.io.FilenameUtils;
import pl.execon.tmo.main.java.data.MailInfoData;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Date;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class EmailReporter {
    public static final String SMTP_HOST = "mail.smtp.host";
    public static final String SMTP_PORT = "mail.smtp.port";
    public static final String SMTP_AUTH = "mail.smtp.auth";
    public static final String SMTP_SSL = "mail.smtp.socketFactory.class";
    public static final String SMTP_SSL_SOCKET = "javax.net.ssl.SSLSocketFactory";
    public static final String CONNECTION_TIMEOUT_PROP_NAME = "mail.smtp.connectiontimeout";
    public static final String SMTP_TIMEOUT_PROP_NAME = "mail.smtp.timeout";
    public static final String CONNECTION_TIMEOUT_VALUE = "60000";
    public static final String SMTP_TIMEOUT_VALUE = "60000";
    public static final String SMTP_TLS = "mail.smtp.starttls.enable";
    public static final String SMTP_TLS_VALUE = "true";
    public static final String SMTP_MAIL_FROM = "mail.from";

    private static final String NON_EMAILABLE_FILE_EXT = "xml";
    private static final String REPORTS_ZIP_FILENAME = "reports.zip";

    private static final int READ_BUFFER_SIZE = 1024;

    private static EmailReporter reporter;

    private EmailReporter() {
    }

    public static synchronized EmailReporter getInstance() {
        if (reporter == null) {
            reporter = new EmailReporter();
        }
        return reporter;
    }

    public void sendEmail(MailInfoData mailInfoData, String content,
                          String reportFilePath) {
        String subject =
                String.format(mailInfoData.getTopic(), CustomFormatter.reportDateFormat.format(new Date()));
        boolean useSsl = mailInfoData.isUseSsl();
        boolean useAuthentication = mailInfoData.isUseAuthentication();

        Properties properties = System.getProperties();
        properties.put(SMTP_HOST, mailInfoData.getHost());
        properties.put(SMTP_PORT, mailInfoData.getPort());
        properties.put(CONNECTION_TIMEOUT_PROP_NAME, CONNECTION_TIMEOUT_VALUE);
        properties.put(SMTP_TIMEOUT_PROP_NAME, SMTP_TIMEOUT_VALUE);
        properties.put(SMTP_TLS, SMTP_TLS_VALUE);
        if (useSsl) {
            properties.put(SMTP_SSL, SMTP_SSL_SOCKET);
        }
        properties.put(SMTP_AUTH, useAuthentication);
        properties.put(SMTP_MAIL_FROM, mailInfoData.getFrom());
        Session session;
        if (useAuthentication) {
            session = Session.getDefaultInstance(properties, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(mailInfoData.getAuthLogin(), mailInfoData.getAuthPassword());
                }
            });
        } else {
            session = Session.getDefaultInstance(properties);
        }

        File att = new File(reportFilePath + File.separator + REPORTS_ZIP_FILENAME);
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(att))) {
            int size = mailInfoData.getTo().size();
            InternetAddress[] toAddresses = new InternetAddress[size];
            for (int i = 0; i < size; i++) {
                toAddresses[i] = InternetAddress.parse(mailInfoData.getTo().get(i))[0];
            }
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(mailInfoData.getFrom()));
            message.setRecipients(Message.RecipientType.TO, toAddresses);
            message.setSubject(subject);


            MimeBodyPart htmlPart = new MimeBodyPart();
            htmlPart.setContent(content, "text/html; charset=utf-8");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(htmlPart);

            File[] attachments = new File(reportFilePath).listFiles();
            BodyPart attachmentBodyPart = new MimeBodyPart();
            ZipEntry fileToZip;

            byte[] buffer = new byte[READ_BUFFER_SIZE];

            if (attachments != null && attachments.length > 0) {
                for (File file : attachments) {
                    if (file.getName().equals(REPORTS_ZIP_FILENAME)) {
                        Log.debug("Skip to prevent recurency.");
                        continue;
                    }
                    if (!FilenameUtils.getExtension(file.getAbsolutePath()).equals(NON_EMAILABLE_FILE_EXT)) {
                        fileToZip = new ZipEntry(file.getName());
                        zos.putNextEntry(fileToZip);
                        try (FileInputStream in = new FileInputStream(file)) {
                            int len;
                            while ((len = in.read(buffer)) > 0) {
                                zos.write(buffer, 0, len);
                            }
                            zos.closeEntry();
                        } catch (IOException e) {
                            Log.info("Can't add file to archive. Reason: " + e.getMessage());
                        }
                    }
                }
            }
            zos.close();
            DataSource source = new FileDataSource(att.getAbsolutePath());
            attachmentBodyPart.setDataHandler(new DataHandler(source));
            attachmentBodyPart.setFileName(att.getName());
            multipart.addBodyPart(attachmentBodyPart);
            message.setContent(multipart);
            Log.info("Transporting message to system");
            Transport.send(message);
        } catch (SocketTimeoutException e) {
            Log.error("Message has not been send, because there was timeout. Check blocked ports.", e);
        } catch (MessagingException | IOException e) {
            Log.error("Error while sending message - message has not been sent. ", e);
        }
    }

}
