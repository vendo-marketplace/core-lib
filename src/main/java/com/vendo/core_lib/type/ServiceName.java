package com.vendo.core_lib.type;

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
}
