package com.vendo.core_lib.annotations.price;

import com.vendo.core_lib.dto.requests.PriceRangeFilterRequest;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

class PriceRangeValidator implements ConstraintValidator<ValidPriceRange, PriceRangeFilterRequest> {

    @Override
    public boolean isValid(PriceRangeFilterRequest value, ConstraintValidatorContext context) {

        if (value == null
                || value.minPrice() == null
                || value.maxPrice() == null
        ) {
            return true;
        }

        return value.maxPrice().compareTo(value.minPrice()) >= 0;
    }

}
