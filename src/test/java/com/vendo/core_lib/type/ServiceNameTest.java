package com.vendo.core_lib.type;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class ServiceNameTest {

    @ParameterizedTest
    @EnumSource(ServiceName.class)
    void getServiceNameReturnsKebabCaseNameMatchingConstant(ServiceName serviceName) {
        String expected = serviceName.name().toLowerCase().replace('_', '-');

        assertThat(serviceName.getServiceName()).isEqualTo(expected);
    }

    @Test
    void getAllNamesReturnsEveryServiceNameValue() {
        Set<String> allNames = ServiceName.getAllNames();

        assertThat(allNames).containsExactlyInAnyOrder(
                "user-service",
                "product-service",
                "auth-service",
                "registry-service",
                "notification-service",
                "aws-service",
                "indexer-service",
                "search-service"
        );
    }

    @Test
    void getAllNamesSizeMatchesEnumConstantsCount() {
        assertThat(ServiceName.getAllNames()).hasSize(ServiceName.values().length);
    }
}
