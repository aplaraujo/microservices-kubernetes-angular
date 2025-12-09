package io.girthub.aplaraujo.product_service.dto;

public record ProductResponse(
        String id,
        String name,
        String description,
        Double price
) {
}
