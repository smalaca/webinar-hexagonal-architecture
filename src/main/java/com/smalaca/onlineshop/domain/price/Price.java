package com.smalaca.onlineshop.domain.price;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class Price {
    private BigDecimal price;
}
