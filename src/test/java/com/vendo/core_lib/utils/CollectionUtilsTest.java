package com.vendo.core_lib.utils;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CollectionUtilsTest {

    @Test
    void isEmptyReturnsTrueForNull() {
        assertThat(CollectionUtils.isEmpty(null)).isTrue();
    }

    @Test
    void isEmptyReturnsTrueForEmptyCollection() {
        assertThat(CollectionUtils.isEmpty(List.of())).isTrue();
    }

    @Test
    void isEmptyReturnsFalseForNonEmptyCollection() {
        assertThat(CollectionUtils.isEmpty(List.of("a"))).isFalse();
    }
}
