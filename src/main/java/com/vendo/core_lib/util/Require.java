package com.vendo.core_lib.util;

import java.util.function.Supplier;

public class Require {

    public static <T> T notNull(Supplier<T> supplier, Supplier<? extends RuntimeException> exception) {
        T value = supplier.get();

        if (value == null) {
            throw exception.get();
        }

        return value;
    }

}
