package com.vendo.core_lib.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringUtilsTest {

    @Test
    void contains_shouldReturnTrue_whenStringIsInArray() {
        assertThat(StringUtils.contains("b", "a", "b", "c")).isTrue();
    }

    @Test
    void contains_shouldReturnFalse_whenStringIsNotInArray() {
        assertThat(StringUtils.contains("z", "a", "b", "c")).isFalse();
    }

    @Test
    void contains_shouldReturnFalseForEmptyArray() {
        assertThat(StringUtils.contains("a")).isFalse();
    }

    @Test
    void isEmpty_shouldReturnTrueForNull() {
        assertThat(StringUtils.isEmpty(null)).isTrue();
    }

    @Test
    void isEmpty_shouldReturnTrueForEmptyString() {
        assertThat(StringUtils.isEmpty("")).isTrue();
    }

    @Test
    void isEmpty_shouldReturnFalseForNonEmptyString() {
        assertThat(StringUtils.isEmpty("a")).isFalse();
    }

    @Test
    void defaultIfEmpty_shouldReturnDefaultForNull() {
        assertThat(StringUtils.defaultIfEmpty(null, "default")).isEqualTo("default");
    }

    @Test
    void defaultIfEmpty_shouldReturnDefaultForEmptyString() {
        assertThat(StringUtils.defaultIfEmpty("", "default")).isEqualTo("default");
    }

    @Test
    void defaultIfEmpty_shouldReturnOriginal_whenNotEmpty() {
        assertThat(StringUtils.defaultIfEmpty("value", "default")).isEqualTo("value");
    }
}
