package com.vendo.core_lib.annotations.price;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PriceRangeValidator.class)
public @interface ValidPriceRange {

    String message() default "Maximum price must be greater than or equal to minimum price.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
