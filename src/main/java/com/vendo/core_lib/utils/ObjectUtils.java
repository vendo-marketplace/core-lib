package com.vendo.core_lib.utils;

public final class ObjectUtils {

    private ObjectUtils() {}

    public static boolean isNotNull(Object obj) {
        return obj != null;
    }

    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static boolean isAllNotNull(Object... objs) {
        if (objs == null) {
            return false;
        }

        for (Object obj : objs) {
            if (isNull(obj)) {
                return false;
            }
        }

        return true;
    }
}
