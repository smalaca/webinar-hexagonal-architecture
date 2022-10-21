package com.smalaca.onlineshop.infrastructure.repository.inmemory.product;

import com.smalaca.onlineshop.domain.product.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductCommandRepository extends CrudRepository<Product, UUID> {
}
