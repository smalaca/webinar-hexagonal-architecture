package com.smalaca.onlineshop.infrastructure.repository.inmemory.offer;

import com.smalaca.onlineshop.domain.offer.Offer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OfferCommandRepository extends CrudRepository<Offer, UUID> {
}
