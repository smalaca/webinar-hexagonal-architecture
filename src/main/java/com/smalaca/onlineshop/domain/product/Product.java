package com.smalaca.onlineshop.domain.product;

import com.smalaca.onlineshop.domain.cart.CartItem;
import com.smalaca.onlineshop.domain.price.Price;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    @Id
    private UUID productId;

    private UUID sellerId;

    private Price price;

    public CartItem asCartItem() {
        return new CartItem(productId, sellerId, price);
    }
}
