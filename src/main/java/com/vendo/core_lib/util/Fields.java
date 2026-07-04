package com.vendo.core_lib.util;

import java.util.Arrays;

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

    public static String[] getEnumValues(Class<?> clazz) {
        if (clazz == null || !clazz.isEnum()) {
            return new String[0];
        }
        return Arrays.stream(clazz.getEnumConstants())
                .map(Object::toString)
                .toArray(String[]::new);
    }
}
