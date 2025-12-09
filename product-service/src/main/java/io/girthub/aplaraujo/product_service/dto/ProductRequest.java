package io.girthub.aplaraujo.product_service.dto;

public record ProductRequest(
        String name,
        String description,
        Double price
) {
}
