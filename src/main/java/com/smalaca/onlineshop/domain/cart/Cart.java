package com.smalaca.onlineshop.domain.cart;

import com.smalaca.onlineshop.domain.offer.Offer;
import com.smalaca.onlineshop.domain.product.Product;

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
@Table(name = "CARTS")
public class Cart {
    @Id
    @GeneratedValue
    private UUID cartId;

    private UUID buyerId;

    @OneToMany(fetch = EAGER)
    private List<CartItem> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product.asCartItem());
    }

    public Offer offerFor(CreateOfferCommand command) {
        return null;
    }
}
