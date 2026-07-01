package com.vendo.core_lib.utils;

public final class Fields {

    private Fields() {}

    public static String nameOf(Class<?> clazz, String fieldName) {
        try {
            clazz.getDeclaredField(fieldName);
            return fieldName;
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException(
                "Field '" + fieldName + "' not found in " + clazz.getName()
            );
        }
    }
}
