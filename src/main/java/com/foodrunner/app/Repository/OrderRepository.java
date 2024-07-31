package com.foodrunner.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodrunner.app.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
 //   List<Order> findByUserId(Long userId);
}
