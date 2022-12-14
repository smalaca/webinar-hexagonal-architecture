package com.smalaca.onlineshop.domain.cart;

import com.smalaca.onlineshop.domain.price.Price;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

import static lombok.AccessLevel.PACKAGE;

@Entity
@Table(name = "CART_ITEM")
@Getter(PACKAGE)
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

    boolean wasSelected(List<UUID> productIds) {
        return productIds.stream().anyMatch(id -> id.equals(productId));
    }
}
