package io.girthub.aplaraujo.product_service.service;

import io.girthub.aplaraujo.product_service.dto.ProductRequest;
import io.girthub.aplaraujo.product_service.dto.ProductResponse;
import io.girthub.aplaraujo.product_service.entities.Product;
import io.girthub.aplaraujo.product_service.mappers.ProductMapper;
import io.girthub.aplaraujo.product_service.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;
    private final ProductMapper mapper;

    public ProductResponse createProduct(ProductRequest request) {
        Product product = mapper.toEntity(request);
        repository.save(product);
        return mapper.toResponse(product);
    }

    public List<ProductResponse> products() {
        return repository.findAll().stream().map(mapper::toResponse).toList();
    }
}
