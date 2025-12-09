package io.girthub.aplaraujo.product_service.mappers;

import io.girthub.aplaraujo.product_service.dto.ProductRequest;
import io.girthub.aplaraujo.product_service.dto.ProductResponse;
import io.girthub.aplaraujo.product_service.entities.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public Product toEntity(ProductRequest request) {
        Product product = new Product();
        product.setName(request.name());
        product.setDescription(request.description());
        product.setPrice(request.price());

        return product;
    }

    public ProductResponse toResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName(), product.getDescription(), product.getPrice());
    }
}
