package com.smalaca.onlineshop.infrastructure.api.rest.offer;

import com.smalaca.onlineshop.domain.cart.CreateOfferCommand;
import com.smalaca.onlineshop.application.offer.OfferCommands;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("offer")
public class OfferRestController {
    private final OfferCommands offerCommands;

    OfferRestController(OfferCommands offerCommands) {
        this.offerCommands = offerCommands;
    }

    @PostMapping
    public UUID create(@RequestBody CreateOfferCommand command) {
        return offerCommands.create(buyerId(), command);
    }

    private UUID buyerId() {
        return getLoggedUserId();
    }

    private UUID getLoggedUserId() {
        return null;
    }
}
