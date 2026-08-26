package com.vendo.core_lib.dto.request;

import java.math.BigDecimal;

public interface PriceRange {

    BigDecimal getMinPrice();
    BigDecimal getMaxPrice();

}
