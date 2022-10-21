package com.smalaca.onlineshop.domain.cart;

import com.smalaca.onlineshop.domain.price.Price;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class CartItem {
    @Id
    @GeneratedValue
    private UUID cartItemId;
    private UUID productId;
    private UUID sellerId;
    private Price price;

    public CartItem(UUID productId, UUID sellerId, Price price) {
        this.productId = productId;
        this.sellerId = sellerId;
        this.price = price;
    }
}
