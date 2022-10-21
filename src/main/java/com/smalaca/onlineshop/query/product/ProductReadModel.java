package com.smalaca.onlineshop.query.product;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "PRODUCTS")
@Getter
public class ProductReadModel {
    @Id
    private UUID id;
}
