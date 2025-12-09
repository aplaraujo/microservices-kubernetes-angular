package io.girthub.aplaraujo.product_service.repositories;

import io.girthub.aplaraujo.product_service.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
