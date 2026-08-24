package com.vendo.core_lib.dto.requests;

import com.vendo.core_lib.annotations.price.ValidPriceRange;
import jakarta.validation.constraints.Min;

import java.math.BigDecimal;

@ValidPriceRange
public record PriceRangeFilterRequest(
        @Min(value = 0, message = "Minimal price must not be less than zero.")
        BigDecimal minPrice,
        BigDecimal maxPrice
) {
}
