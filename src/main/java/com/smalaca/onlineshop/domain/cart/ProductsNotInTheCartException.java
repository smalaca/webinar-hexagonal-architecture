package com.smalaca.onlineshop.domain.cart;

import java.util.List;
import java.util.UUID;

class ProductsNotInTheCartException extends RuntimeException {
    private final List<UUID> existing;
    private final List<UUID> productIds;

    ProductsNotInTheCartException(List<UUID> existing, List<UUID> selected) {
        this.existing = existing;
        this.productIds = selected;
    }
}
