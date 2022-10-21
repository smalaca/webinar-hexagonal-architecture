package com.smalaca.onlineshop.query.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "PRODUCTS")
public class ProductDto {
    @Id
    private UUID id;
}
