package com.vendo.core_lib.utils;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class FuncUtilsTest {

    @Test
    void notNull_shouldReturnValue_whenSupplierYieldsNonNull() {
        String result = FuncUtils.notNull(() -> "value", IllegalStateException::new);

        assertThat(result).isEqualTo("value");
    }

    @Test
    void notNull_shouldThrowSuppliedException_whenValueIsNull() {
        assertThatThrownBy(() -> FuncUtils.notNull(() -> null, () -> new NoSuchElementException("missing")))
                .isInstanceOf(NoSuchElementException.class)
                .hasMessage("missing");
    }
}
