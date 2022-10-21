package com.smalaca.onlineshop.query.product;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

import static java.util.Collections.emptyList;

@Component
public class ProductQueries {
    private final ProductQueryRepository repository;

    ProductQueries(ProductQueryRepository repository) {
        this.repository = repository;
    }

    public List<ProductReadModel> findAllBy(Map<String, String> filters) {
        return emptyList();
    }
}
