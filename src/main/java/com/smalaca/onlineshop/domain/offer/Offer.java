package com.smalaca.onlineshop.domain.offer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "OFFERS")
public class Offer {
    @Id
    @GeneratedValue
    private UUID offerId;

    public UUID getId() {
        return offerId;
    }
}
