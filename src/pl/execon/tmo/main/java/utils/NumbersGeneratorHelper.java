package pl.execon.tmo.main.java.utils;

import java.text.SimpleDateFormat;
import java.util.*;

public class NumbersGeneratorHelper {
    public static final String UPPPER_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWER_CHARS = UPPPER_CHARS.toLowerCase(Locale.ROOT);
    public static final String DIGITS = "0123456789";
    public static final String LETTERS = UPPPER_CHARS + LOWER_CHARS;
    public static final String ALPHANUM_CHARS = LETTERS + DIGITS;
    public static final String SPECIAL_CHARS = "~!@#$%^&*()_+|\\=-`,<.>/?':;]}[{";
    public static final String ALL_CHARS = SPECIAL_CHARS + ALPHANUM_CHARS;

    public static final Integer MAX_AWIZO_LENGTH = 9;
    public static final Integer X_MAX_LENGTH = 6;
    public static final Integer PREFIX_MAX_LENGTH = 3;

    public static Object[][] orderNumberGenerator(SimpleDateFormat sdf, String numberPostPrefix, boolean isPostfix) {
        String generatedNumber;
        List<OrderInfo> testData = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 1);
        OrderInfo orderInfo = new OrderInfo();
        if (isPostfix) {
            orderInfo.setOrderNumber(sdf.format(calendar.getTime()) + numberPostPrefix);
            testData.add(orderInfo);
            return new Object[][]{{testData}};
        } else {
            orderInfo.setOrderNumber(numberPostPrefix + sdf.format(calendar.getTime()));
            testData.add(orderInfo);
            return new Object[][]{{testData}};
        }

    }

    public static Object[][] awizoNumberGenerator(String prefix, String charsType, boolean xIsCorrect, boolean prefixIsCorrect, Integer xLength, boolean fullPage) {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        List<OrderInfo> testData = new ArrayList<>();
        OrderInfo orderInfo = new OrderInfo();
        if (!xIsCorrect && !prefixIsCorrect) {
            for (int i = 0; i < MAX_AWIZO_LENGTH; i++) {
                builder.append(charsType.charAt(random.nextInt(charsType.length())));
            }
            orderInfo.setOrderNumber(builder.toString());
            testData.add(orderInfo);
            return new Object[][]{{testData}};
        } else if (xIsCorrect && !prefixIsCorrect) {
            for (int i = 0; i < PREFIX_MAX_LENGTH; i++) {
                builder.append(charsType.charAt(random.nextInt(charsType.length())));
            }
            for (int i = 0; i < X_MAX_LENGTH; i++) {
                builder.append(ALPHANUM_CHARS.charAt(random.nextInt(ALPHANUM_CHARS.length())));
            }
            orderInfo.setOrderNumber(builder.toString());
            testData.add(orderInfo);
            return new Object[][]{{testData}};
        } else {
            if (fullPage) {
                for (int j = 0; j < 10; j++) {
                    StringBuilder builderFullPage = new StringBuilder();
                    OrderInfo orderInfoForFullPage = new OrderInfo();
                    for (int i = 0; i < xLength; i++) {
                        builderFullPage.append(charsType.charAt(random.nextInt(charsType.length())));
                    }
                    orderInfoForFullPage.setOrderNumber(prefix + builderFullPage.toString());
                    testData.add(orderInfoForFullPage);
                }
                return new Object[][]{{testData}};
            }
            else{
                for (int i = 1; i < xLength; i++) {
                    builder.append(charsType.charAt(random.nextInt(charsType.length())));
                }
                orderInfo.setOrderNumber(prefix + builder.toString());
                testData.add(orderInfo);
                return new Object[][]{{testData}};
            }
        }
    }

    public static Object[][] referenceNumberGenerator(Integer referenceNumberLength) {
        Random random = new Random();
        List<OrderInfo> testData = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < referenceNumberLength; i++) {
                builder.append(ALPHANUM_CHARS.charAt(random.nextInt(ALPHANUM_CHARS.length())));
            }
            OrderInfo orderInfo = new OrderInfo();
            orderInfo.setReferenceNumber(builder.toString());
            testData.add(orderInfo);
        }
        return new Object[][]{{testData}};
    }
}
