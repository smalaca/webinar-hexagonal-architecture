package com.smalaca.onlineshop.domain.offer;

import com.smalaca.onlineshop.domain.price.Price;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "OFFER_ITEM")
class OfferItem {
    @Id
    @GeneratedValue
    private UUID cartItemId;
    private UUID productId;
    private UUID sellerId;
    private Price price;

    OfferItem(UUID productId, UUID sellerId, Price price) {
        this.productId = productId;
        this.sellerId = sellerId;
        this.price = price;
    }
}
