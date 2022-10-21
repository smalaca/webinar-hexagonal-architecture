package com.smalaca.onlineshop.infrastructure.api.rest.cart;

import com.smalaca.onlineshop.application.cart.CartCommands;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("cart")
public class CartRestController {
    private final CartCommands cartCommands;

    CartRestController(CartCommands cartCommands) {
        this.cartCommands = cartCommands;
    }

    @PutMapping
    public void addProduct(@RequestBody UUID productId) {
        cartCommands.addProduct(buyerId(), productId);
    }

    private UUID buyerId() {
        return getLoggedUserId();
    }

    private UUID getLoggedUserId() {
        return null;
    }
}
