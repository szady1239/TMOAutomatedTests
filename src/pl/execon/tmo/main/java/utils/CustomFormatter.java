package pl.execon.tmo.main.java.utils;

import java.text.SimpleDateFormat;

public class CustomFormatter {

  private static final String REPORT_DATE_FORMAT = "dd.MM.yyyy HH:mm:ss";

  public static final SimpleDateFormat reportDateFormat = new SimpleDateFormat(REPORT_DATE_FORMAT);

  private CustomFormatter() {}



}
