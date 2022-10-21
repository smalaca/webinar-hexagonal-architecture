package com.smalaca.onlineshop.infrastructure.repository.inmemory.product;

import com.smalaca.onlineshop.domain.product.Product;
import com.smalaca.onlineshop.domain.product.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class InMemoryProductRepository implements ProductRepository {
    private final ProductCommandRepository repository;

    InMemoryProductRepository(ProductCommandRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product findById(UUID productId) {
        return repository.findById(productId).get();
    }
}
