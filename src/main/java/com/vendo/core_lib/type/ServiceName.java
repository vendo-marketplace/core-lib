package com.vendo.core_lib.type;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public enum ServiceName {

    USER_SERVICE("user-service"),
    PRODUCT_SERVICE("product-service"),
    AUTH_SERVICE("auth-service"),
    REGISTRY_SERVICE("registry-service"),
    NOTIFICATION_SERVICE("notification-service"),
    AWS_SERVICE("aws-service"),
    INDEXER_SERVICE("indexer-service"),
    SEARCH_SERVICE("search-service");

    private final String serviceName;

    ServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public static Set<String> getAllNames() {
        return Arrays.stream(values()).map(ServiceName::getServiceName).collect(Collectors.toSet());
    }
}
