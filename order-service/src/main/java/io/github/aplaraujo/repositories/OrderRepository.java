package io.github.aplaraujo.repositories;

import io.github.aplaraujo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
