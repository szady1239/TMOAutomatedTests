package pl.execon.tmo.main.java.data;

import java.util.ArrayList;
import java.util.List;

public class MailInfoData {
  public static final String SENDER = "SMTP Nadawca";
  public static final String HOST = "SMTP Host";
  public static final String PASSWORD = "SMTP Hasło";
  public static final String PORT = "SMTP Port";
  public static final String USE_SSL = "SMTP Użyj SSL";
  public static final String RECEIVER = "SMTP Odbiorca";
  public static final String TOPIC = "SMTP Temat";
  public static final String USE_AUTHENTICATION = "SMTP Użyj uwierzytelniania";
  public static final String AUTH_LOGIN = "Login domenowy";
  public static final String AUTH_PASSWORD = "Hasło domenowe";

  private String from;
  private List<String> to;
  private String host;
  private int port;
  private String password;
  private String topic;
  private boolean useSsl;
  private boolean useAuthentication;
  private String authLogin;
  private String authPassword;

  public MailInfoData() {
    super();
    to = new ArrayList<String>();
    useSsl = false;
    useAuthentication = false;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public List<String> getTo() {
    return to;
  }

  public void addTo(String to) {
    this.to.add(to);
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public boolean isUseSsl() {
    return useSsl;
  }

  public void setUseSsl(boolean useSsl) {
    this.useSsl = useSsl;
  }

  public boolean isUseAuthentication() {
    return useAuthentication;
  }

  public void setUseAuthentication(boolean useAuthentication) {
    this.useAuthentication = useAuthentication;
  }

  public String getAuthLogin() {
    return authLogin;
  }

  public void setAuthLogin(String authLogin) {
    this.authLogin = authLogin;
  }

  public String getAuthPassword() {
    return authPassword;
  }

  public void setAuthPassword(String authPassword) {
    this.authPassword = authPassword;
  }
}
