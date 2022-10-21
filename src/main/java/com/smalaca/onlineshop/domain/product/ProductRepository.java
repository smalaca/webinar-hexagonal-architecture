package com.smalaca.onlineshop.domain.product;

import java.util.UUID;

public interface ProductRepository {
    Product findById(UUID productId);
}
