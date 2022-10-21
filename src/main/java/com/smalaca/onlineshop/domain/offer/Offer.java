package com.smalaca.onlineshop.domain.offer;

import com.smalaca.onlineshop.domain.price.Price;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static javax.persistence.FetchType.EAGER;

@Entity
@Table(name = "OFFERS")
public class Offer {
    @Id
    @GeneratedValue
    private UUID offerId;
    private UUID buyerId;

    @OneToMany(fetch = EAGER)
    private List<OfferItem> products;

    private Offer(UUID buyerId, List<OfferItem> products) {

        this.buyerId = buyerId;
        this.products = products;
    }

    public UUID getId() {
        return offerId;
    }

    public static class Builder {
        private final UUID buyerId;
        private final List<OfferItem> products = new ArrayList<>();

        public Builder(UUID buyerId) {
            this.buyerId = buyerId;
        }

        public void product(UUID productId, UUID sellerId, Price price) {
            products.add(new OfferItem(productId, sellerId, price));
        }

        public Offer build() {
            return new Offer(buyerId, products);
        }
    }
}
