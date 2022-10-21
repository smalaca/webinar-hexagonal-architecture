package com.smalaca.onlineshop.domain.cart;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static javax.persistence.FetchType.EAGER;

@Entity
@Table(name = "CARTS")
public class Cart {
    @Id
    @GeneratedValue
    private UUID id;

    private UUID buyerId;

    @ElementCollection(fetch = EAGER)
    private List<UUID> productIds = new ArrayList<>();

    public void add(UUID productId) {
        productIds.add(productId);
    }
}
