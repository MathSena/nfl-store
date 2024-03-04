package com.mathsena.productms.controller;

import com.mathsena.productms.dto.ProductDto;
import com.mathsena.productms.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductDto product) {
        productService.createProduct(product);

    }

    // TODO: Add the remaining CRUD operations
}
