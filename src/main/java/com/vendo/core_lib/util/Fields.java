package com.vendo.core_lib.util;

public final class Fields {

    private Fields() {}

    public static String nameOf(Class<?> clazz, String fieldName) {
        try {
            clas.getDeclaredField(fieldName);
            return fieldName;
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException(
                "Field '" + fieldName + "' not found in " + clas.getName()
            );
        }
    }
}
