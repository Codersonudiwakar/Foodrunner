package com.foodrunner.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodrunner.app.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

