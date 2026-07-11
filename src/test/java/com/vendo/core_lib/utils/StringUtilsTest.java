package com.vendo.core_lib.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringUtilsTest {

    @Test
    void containsReturnsTrueWhenStringIsInArray() {
        assertThat(StringUtils.contains("b", "a", "b", "c")).isTrue();
    }

    @Test
    void containsReturnsFalseWhenStringIsNotInArray() {
        assertThat(StringUtils.contains("z", "a", "b", "c")).isFalse();
    }

    @Test
    void containsReturnsFalseForEmptyArray() {
        assertThat(StringUtils.contains("a")).isFalse();
    }

    @Test
    void isEmptyReturnsTrueForNull() {
        assertThat(StringUtils.isEmpty(null)).isTrue();
    }

    @Test
    void isEmptyReturnsTrueForEmptyString() {
        assertThat(StringUtils.isEmpty("")).isTrue();
    }

    @Test
    void isEmptyReturnsFalseForNonEmptyString() {
        assertThat(StringUtils.isEmpty("a")).isFalse();
    }

    @Test
    void defaultIfEmptyReturnsDefaultForNull() {
        assertThat(StringUtils.defaultIfEmpty(null, "default")).isEqualTo("default");
    }

    @Test
    void defaultIfEmptyReturnsDefaultForEmptyString() {
        assertThat(StringUtils.defaultIfEmpty("", "default")).isEqualTo("default");
    }

    @Test
    void defaultIfEmptyReturnsOriginalWhenNotEmpty() {
        assertThat(StringUtils.defaultIfEmpty("value", "default")).isEqualTo("value");
    }
}
