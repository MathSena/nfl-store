package com.mathsena.productms.controller;

import com.mathsena.productms.dto.ProductRequest;
import com.mathsena.productms.dto.ProductResponse;
import com.mathsena.productms.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest product) {
        productService.createProduct(product);

    }

    // TODO: Add the remaining CRUD operations
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> listProducts() {
        return productService.listProducts();
    }
}
