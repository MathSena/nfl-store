package com.mathsena.productms.service;

import com.mathsena.productms.dto.ProductRequest;
import com.mathsena.productms.dto.ProductResponse;
import com.mathsena.productms.models.Product;
import com.mathsena.productms.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    @Autowired
    private final ProductRepository productRepository;

    public void createProduct(ProductRequest product) {
        Product productModel = Product.builder()
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();

        productRepository.save(productModel);
        log.info("Product created: {}", productModel.getId());

    }

    public List<ProductResponse> listProducts() {
        log.info("Listing all products");
        return productRepository.findAll()
                .stream()
                .map(product -> ProductResponse.builder()
                        .id(product.getId())
                        .name(product.getName())
                        .description(product.getDescription())
                        .price(product.getPrice())
                        .build())
                .toList();
    }
}
