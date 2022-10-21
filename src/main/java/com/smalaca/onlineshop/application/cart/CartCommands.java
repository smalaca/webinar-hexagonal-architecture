package com.smalaca.onlineshop.application.cart;

import com.smalaca.onlineshop.domain.cart.Cart;
import com.smalaca.onlineshop.domain.cart.CartRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CartCommands {
    private final CartRepository cartRepository;

    CartCommands(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public void addProduct(UUID buyerId, UUID productId) {
        Cart cart = cartRepository.findFor(buyerId);

        cart.add(productId);

        cartRepository.save(cart);
    }
}
