package com.smalaca.onlineshop.application.offer;

import com.smalaca.onlineshop.domain.cart.Cart;
import com.smalaca.onlineshop.domain.cart.CartRepository;
import com.smalaca.onlineshop.domain.cart.CreateOfferCommand;
import com.smalaca.onlineshop.domain.offer.Offer;
import com.smalaca.onlineshop.domain.offer.OfferRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class OfferCommands {
    private final OfferRepository offerRepository;
    private final CartRepository cartRepository;

    OfferCommands(OfferRepository offerRepository, CartRepository cartRepository) {
        this.offerRepository = offerRepository;
        this.cartRepository = cartRepository;
    }

    public UUID create(UUID buyerId, CreateOfferCommand command) {
        Cart cart = cartRepository.findFor(buyerId);

        Offer offer = cart.offerFor(command);

        return offerRepository.save(offer);
    }
}
