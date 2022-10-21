package com.smalaca.onlineshop.infrastructure.repository.inmemory.cart;

import com.smalaca.onlineshop.domain.cart.Cart;
import com.smalaca.onlineshop.domain.cart.CartRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class InMemoryCartRepository implements CartRepository {
    private final CartCommandRepository repository;

    InMemoryCartRepository(CartCommandRepository repository) {
        this.repository = repository;
    }

    @Override
    public Cart findFor(UUID buyerId) {
        return repository.findByBuyerId(buyerId);
    }

    @Override
    public void save(Cart cart) {
        repository.save(cart);
    }
}
