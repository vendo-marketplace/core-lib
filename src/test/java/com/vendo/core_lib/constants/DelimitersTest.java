package com.vendo.core_lib.constants;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DelimitersTest {

    @Test
    void constantsHaveExpectedValues() {
        assertThat(Delimiters.COLON_DELIMITER).isEqualTo(": ");
        assertThat(Delimiters.COMMA_DELIMITER).isEqualTo(", ");
    }
}
