package com.smalaca.onlineshop.infrastructure.repository.inmemory.cart;

import com.smalaca.onlineshop.domain.cart.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface CartCommandRepository extends CrudRepository<Cart, UUID> {
    Cart findByBuyerId(UUID buyerId);
}
