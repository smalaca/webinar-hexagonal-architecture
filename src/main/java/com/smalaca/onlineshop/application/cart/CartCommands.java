package com.smalaca.onlineshop.application.cart;

import com.smalaca.onlineshop.domain.cart.Cart;
import com.smalaca.onlineshop.domain.cart.CartRepository;
import com.smalaca.onlineshop.domain.product.Product;
import com.smalaca.onlineshop.domain.product.ProductRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CartCommands {
    private final CartRepository cartRepository;
    private final ProductRepository productRepository;

    CartCommands(CartRepository cartRepository, ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
    }

    public void addProduct(UUID buyerId, UUID productId) {
        Cart cart = cartRepository.findFor(buyerId);
        Product product = productRepository.findById(productId);

        cart.add(product);

        cartRepository.save(cart);
    }
}
