# core-lib

## Overview
`core-lib` is a shared library for the Vendo ecosystem that provides reusable constants, utility classes, and enums common to multiple microservices. It helps avoid code duplication and serves as a single source of truth for cross-cutting elements.

## Features

* Shared constants (delimiters, separators, etc.)
* Utility classes for common operations (string, collection, assertion handling)
* Enums for domain and technical values used across multiple services
* Easy integration into any module of the Vendo ecosystem via a Maven dependency

## Installation
Add the dependency to your `pom.xml`:

```xml

<dependency>
    <groupId>io.github.vendo-marketplace-be</groupId>
    <artifactId>core-lib</artifactId>
    <version>latest-version</version>
    <packaging>jar</packaging>
</dependency>

```

## Usage
Once the dependency is added, the classes, constants, and enums from `core-lib` become available for direct import in any module of the project.

Example:

```java
import com.vendo.core_lib.utils.StringUtils;
import com.vendo.core_lib.utils.CollectionUtils;

// Example usage
String defaultStr = StringUtils.defaultIfEmpty("", "default");
boolean isEmpty = CollectionUtils.isEmpty(List.of());
```

## Requirements

* Java 17

## Notes
This library is intended solely for internal use within the Vendo ecosystem (`com.vendo`). Avoid adding service-specific business logic — include only cross-cutting elements shared across multiple modules.