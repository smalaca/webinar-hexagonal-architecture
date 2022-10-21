package com.smalaca.onlineshop.query.cart;

import lombok.Getter;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static javax.persistence.FetchType.EAGER;

@Entity
@Table(name = "CARTS")
@Getter
public class CartReadModel {
    @Id
    private UUID id;

    private UUID buyerId;

    @ElementCollection(fetch = EAGER)
    private List<UUID> productIds = new ArrayList<>();
}
