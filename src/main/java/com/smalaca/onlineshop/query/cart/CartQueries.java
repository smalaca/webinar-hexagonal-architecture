package com.smalaca.onlineshop.query.cart;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CartQueries {
    private final CartQueryRepository repository;

    CartQueries(CartQueryRepository repository) {
        this.repository = repository;
    }

    public CartReadModel findForBuyer(UUID buyerId) {
        return repository.findByBuyerId(buyerId);
    }
}
