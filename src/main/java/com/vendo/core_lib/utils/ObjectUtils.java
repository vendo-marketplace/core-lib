package com.vendo.core_lib.utils;

public final class ObjectUtils {

    public static boolean isNotNull(Object obj) {
        return obj != null;
    }

    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static boolean isAllNotNull(Object... objs) {
        for (Object obj : objs) {
            if (isNull(obj)) {
                return false;
            }
        }

        return true;
    }

}
