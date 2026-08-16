package com.vendo.core_lib.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ObjectUtilsTest {

    @Test
    void isNotNull_shouldReturnTrue_whenObjectIsPresent() {
        assertThat(ObjectUtils.isNotNull(new Object())).isTrue();
    }

    @Test
    void isNotNull_shouldReturnFalse_whenObjectIsPresent() {
        assertThat(ObjectUtils.isNotNull(null)).isFalse();
    }

    @Test
    void isNull_shouldReturnTrue_whenObjectIsNull() {
        assertThat(ObjectUtils.isNull(null)).isTrue();
    }

    @Test
    void isNull_shouldReturnFalse_whenObjectIsPresent() {
        assertThat(ObjectUtils.isNull(new Object())).isFalse();
    }

    @Test
    void isAllNotNull_shouldReturnTrue_whenAllObjectArePresent() {
        assertThat(ObjectUtils.isAllNotNull(new Object(), new Object(), new Object()));
    }

    @Test
    void isAllNotNull_shouldReturnFalse_whenOneObjectIsNull() {
        assertThat(ObjectUtils.isAllNotNull(new Object(), null, new Object()));
    }

    @Test
    void isAllNotNull_shouldReturnTrue_whenNoObjectsPassed() {
        assertThat(ObjectUtils.isAllNotNull());
    }
}
