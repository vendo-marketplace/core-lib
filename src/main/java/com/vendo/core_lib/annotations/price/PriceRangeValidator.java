package com.vendo.core_lib.annotations.price;

import com.vendo.core_lib.dto.request.PriceRange;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

class PriceRangeValidator implements ConstraintValidator<ValidPriceRange, PriceRange> {

    @Override
    public boolean isValid(PriceRange value, ConstraintValidatorContext context) {

        if (value == null
                || value.getMinPrice() == null
                || value.getMaxPrice() == null
        ) {
            return true;
        }

        return value.getMaxPrice().compareTo(value.getMinPrice()) >= 0;
    }

}
