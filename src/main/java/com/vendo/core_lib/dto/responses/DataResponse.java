package com.vendo.core_lib.dto.responses;

import java.util.List;

public record DataResponse<T>(List<T> data) {
}
