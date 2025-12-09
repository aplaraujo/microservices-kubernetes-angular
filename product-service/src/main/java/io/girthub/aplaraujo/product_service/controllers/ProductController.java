package io.girthub.aplaraujo.product_service.controllers;

import io.girthub.aplaraujo.product_service.dto.ProductRequest;
import io.girthub.aplaraujo.product_service.dto.ProductResponse;
import io.girthub.aplaraujo.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createProduct(request));
    }

    @GetMapping
    public List<ProductResponse> products() {
        return service.products();
    }
}
