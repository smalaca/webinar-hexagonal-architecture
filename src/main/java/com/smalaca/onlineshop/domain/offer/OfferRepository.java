package com.smalaca.onlineshop.domain.offer;

import java.util.UUID;

public interface OfferRepository {
    UUID save(Offer offer);
}
