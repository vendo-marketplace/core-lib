package com.vendo.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Service {

    USER_SERVICE("user-service"),
    PRODUCT_SERVICE("product-service"),
    AUTH_SERVICE("auth-service"),
    REGISTRY_SERVICE("registry-service");

    private final String name;

}
