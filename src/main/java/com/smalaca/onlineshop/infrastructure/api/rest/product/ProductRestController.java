package com.smalaca.onlineshop.infrastructure.api.rest.product;

import com.smalaca.onlineshop.query.product.ProductDto;
import com.smalaca.onlineshop.query.product.ProductQueries;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("product")
public class ProductRestController {
    private final ProductQueries productQueries;

    ProductRestController(ProductQueries productQueries) {
        this.productQueries = productQueries;
    }

    @GetMapping
    public List<ProductDto> findAllBy(@RequestParam Map<String, String> filters) {
        return productQueries.findAllBy(filters);
    }
}
