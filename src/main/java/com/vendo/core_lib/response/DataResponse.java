package com.vendo.core_lib.response;

import java.util.List;

public record DataResponse<T>(List<T> data) {
}
