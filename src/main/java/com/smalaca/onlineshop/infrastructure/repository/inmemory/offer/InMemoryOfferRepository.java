package com.smalaca.onlineshop.infrastructure.repository.inmemory.offer;

import com.smalaca.onlineshop.domain.offer.Offer;
import com.smalaca.onlineshop.domain.offer.OfferRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class InMemoryOfferRepository implements OfferRepository {
    private final OfferCommandRepository repository;

    InMemoryOfferRepository(OfferCommandRepository repository) {
        this.repository = repository;
    }

    @Override
    public UUID save(Offer offer) {
        return repository.save(offer).getId();
    }
}
