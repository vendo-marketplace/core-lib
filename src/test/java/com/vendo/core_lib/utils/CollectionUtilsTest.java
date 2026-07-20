package com.vendo.core_lib.utils;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CollectionUtilsTest {

    @Test
    void isEmpty_shouldReturnTrueForNull() {
        assertThat(CollectionUtils.isEmpty(null)).isTrue();
    }

    @Test
    void isEmpty_shouldReturnTrueForEmptyCollection() {
        assertThat(CollectionUtils.isEmpty(List.of())).isTrue();
    }

    @Test
    void isEmpty_shouldReturnFalseForNonEmptyCollection() {
        assertThat(CollectionUtils.isEmpty(List.of("a"))).isFalse();
    }
}
