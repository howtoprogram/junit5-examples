package com.howtoprogram.junit5;

public final class StringUtils {

  public static Double convertToDouble(String str) {
    if (str == null) {
      return null;
    }
    return Double.valueOf(str);
  }

  public static boolean isNullOrBlank(String st) {
    return st == null || st.trim().length() == 0;
  }

  public static String getDefaultIfNull(final String st, final String defaultSt) {
    return st == null ? defaultSt : st;
  }

}

