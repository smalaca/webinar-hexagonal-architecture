package com.smalaca.onlineshop.query.cart;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface CartQueryRepository extends CrudRepository<CartReadModel, UUID> {
    CartReadModel findByBuyerId(UUID buyerId);
}
