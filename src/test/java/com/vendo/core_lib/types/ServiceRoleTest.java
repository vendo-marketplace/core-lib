package com.vendo.core_lib.types;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ServiceRoleTest {

    @Test
    void values_shouldHaveExactlyOneValue() {
        assertThat(ServiceRole.values()).containsExactly(ServiceRole.INTERNAL);
    }
}
