package com.smalaca.onlineshop.domain.cart;

import java.util.UUID;

public interface CartRepository {
    Cart findFor(UUID buyerId);

    void save(Cart cart);
}
