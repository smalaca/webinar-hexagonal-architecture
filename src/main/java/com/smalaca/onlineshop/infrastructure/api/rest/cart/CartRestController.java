package com.smalaca.onlineshop.infrastructure.api.rest.cart;

import com.smalaca.onlineshop.application.cart.CartCommands;
import com.smalaca.onlineshop.query.cart.CartQueries;
import com.smalaca.onlineshop.query.cart.CartReadModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("cart")
public class CartRestController {
    private final CartCommands cartCommands;
    private final CartQueries cartQueries;

    CartRestController(CartCommands cartCommands, CartQueries cartQueries) {
        this.cartCommands = cartCommands;
        this.cartQueries = cartQueries;
    }

    @GetMapping
    public CartReadModel display() {
        return cartQueries.findForBuyer(buyerId());
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
