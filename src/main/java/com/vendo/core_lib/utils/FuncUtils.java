package com.vendo.core_lib.utils;

import java.util.function.Supplier;

public class FuncUtils {

    public static <T> T notNull(Supplier<T> supplier, Supplier<? extends RuntimeException> exception) {
        T value = supplier.get();

        if (value == null) {
            throw exception.get();
        }

        return value;
    }

}
