package com.smalaca.onlineshop.query.product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface ProductQueryRepository extends CrudRepository<ProductReadModel, UUID> {
}
