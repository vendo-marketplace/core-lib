package com.vendo.core_lib.constants;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SeparatorsTest {

    @Test
    void constantsHaveExpectedValues() {
        assertThat(Separators.EMPTY_STRING).isEqualTo("");
        assertThat(Separators.BLANK_STRING).isEqualTo("");
        assertThat(Separators.SLASH_SEPARATOR).isEqualTo("/");
        assertThat(Separators.DOT_SEPARATOR).isEqualTo(".");
    }
}
