package pl.execon.tmo.main.java.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.Random;
import java.util.regex.Pattern;

/**
 * Class used to convert string to numbers
 *
 * @author Pawel Lagodzinski
 * @author Mateusz Grajper
 * @since 2016-07-21
 * @version 1.0
 */
public class GenericDataHelper {

  private static final String yes = "tak";

  private GenericDataHelper() {
  }

  /**
   * Convert String to boolean
   *
   * @param bool String to check
   * @return true if bool is equal to 'tak', false if not
   */
  public static boolean parseBool(String bool) {
    if (bool == null || bool.isEmpty()) {
      return Boolean.FALSE;
    }
    if (bool.toLowerCase().contains(yes)) {
      return true;
    }
    return Boolean.FALSE;
  }

  public static String removeWhiteSpace(String param) {
    param = StringUtils.stripEnd(param, " ");
    param = StringUtils.stripStart(param, " ");
    return param.replaceAll(" +", " ");
  }

  /**
   * Parse String to float
   * 
   * @param floatString string to parse
   * @param defaultValue returned when parsed string is wrong
   * @return float number or default value if string is incorrect
   */
  public static Float parseFloat(String floatString, Float defaultValue) {
    Float result = defaultValue;
    try {
      result = Float.parseFloat(floatString);
    } catch (NumberFormatException e) {
      Log.info("Błędny format parametru", e);
    } catch (NullPointerException e) {
      Log.info("Brak podanego parametru", e);
    }
    return result;
  }

  /**
   * Parse String to float using special parameters
   *
   * @param singleValue basic string to parse
   * @param stepString ??
   * @param random object need to generate random value
   * @param amount ??
   * @param counter ??
   * @return float number or null if string is null or is empty
   */
  public static Float getFloatFromString(String singleValue, String stepString, Random random,
      int amount, int counter) {
    if (singleValue == null || singleValue.isEmpty()) {
      return null;
    }
    singleValue = singleValue.replaceAll(",", ".");
    String[] interval = singleValue.split(":");
    String[] set = singleValue.split(Pattern.quote("|"));
    String[] randomSet = singleValue.split(Pattern.quote("-"));
    Float returnValue = 0f;

    if (interval.length == 2) {
      Float start = Float.parseFloat(interval[0]);
      Float end = Float.parseFloat(interval[1]);
      returnValue = random.nextFloat() * (end - start) + start;
    } else if (set.length > 1) {
      if (set.length != amount) {
        throw new NumberFormatException("Zła ilość danyh w zbiorze " + singleValue);
      }
      returnValue = Float.parseFloat(set[counter]);
    } else if (randomSet.length > 1) {
      int elementNo = Math.abs(random.nextInt()) % randomSet.length;
      returnValue = Float.parseFloat(randomSet[elementNo]);
    } else {
      returnValue = parseFloat(singleValue, 0.1f);

      Float step = parseFloat(stepString, 0f);
      returnValue += (step * counter);
    }
    return returnValue;
  }

  /**
   * Parse String to Integer
   *
   * @param value string to parse
   * @return parsed integer or null when string is incorrect
   */
  public static Integer getIntegerFromString(String value) {
    Integer returnValue;
    try {
      returnValue = Integer.parseInt(value);
    } catch (NumberFormatException | NullPointerException e) {
      Log.info("Problem while parsing", e);
      returnValue = null;
    }
    return returnValue;
  }

}
