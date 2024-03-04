package com.mathsena.productms.repository;

import com.mathsena.productms.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String>{

}
