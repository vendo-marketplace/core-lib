package com.vendo.core_lib.utils;

public final class StringUtils {

    public static boolean contains(String str, String... arr) {
        for (String value : arr) {
            if (str.equals(value)) return true;
        }

        return false;
    }

    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static String defaultIfEmpty(String str, String defaultStr) {
        return isEmpty(str) ? defaultStr : str;
    }

}
