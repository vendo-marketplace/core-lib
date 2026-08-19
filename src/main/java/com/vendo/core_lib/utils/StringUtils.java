package com.vendo.core_lib.utils;

public final class StringUtils {

    private StringUtils() {}

    public static boolean contains(String str, String... arr) {
        if (arr == null) {
            return false;
        }

        for (String value : arr) {
            if (str.equals(value)) return true;
        }

        return false;
    }

    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean isNotEmptyAll(String... strs) {
        if (strs == null) {
            return false;
        }

        for (String str : strs) {
            if (isEmpty(str)) {
                return false;
            }
        }

        return true;
    }

    public static String defaultIfEmpty(String str, String defaultStr) {
        return isEmpty(str) ? defaultStr : str;
    }

}
