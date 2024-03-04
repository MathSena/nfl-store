package com.mathsena.productms.service;

import com.mathsena.productms.dto.ProductDto;
import com.mathsena.productms.models.Product;
import com.mathsena.productms.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    @Autowired
    private final ProductRepository productRepository;

    public void createProduct(ProductDto product) {
        Product productModel = Product.builder()
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();

        productRepository.save(productModel);
        log.info("Product created: {}", productModel.getId());

    }
}
