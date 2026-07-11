package com.vendo.core_lib.type;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ServiceRoleTest {

    @Test
    void hasExactlyOneValue() {
        assertThat(ServiceRole.values()).containsExactly(ServiceRole.INTERNAL);
    }
}
