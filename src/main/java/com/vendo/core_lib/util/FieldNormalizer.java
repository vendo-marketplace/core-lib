package com.vendo.core_lib.util;

public interface FieldNormalizer<T, R> {

    T normalize(R field);

}
