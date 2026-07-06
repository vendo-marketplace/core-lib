package com.vendo.core_lib.utils;

import java.util.Arrays;

public final class ClassFields {

    private ClassFields() {
    }

    public static String nameOf(String fieldName, Class<?> clazz) {
        try {
            clazz.getDeclaredField(fieldName);
            return fieldName;
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException(
                    "Field '" + fieldName + "' not found in " + clazz.getName() + "."
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
