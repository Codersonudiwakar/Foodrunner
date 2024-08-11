package com.foodrunner.app.controller;
import java.util.*;
import org.springframework.web.bind.annotation.*;

import com.foodrunner.app.entities.Order;
import com.foodrunner.app.service.OrderService;

import org.springframework.beans.factory.annotation.*;

@RestController
@RequestMapping("/foodRunner/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/addOrder")
    public Order createOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

    @GetMapping("/user/{userId}")
    public List<Order> getOrdersByUserId(@PathVariable Long userId) {
        return orderService.getOrdersByUserId(userId);
    }

    @PutMapping("/{id}")
    public Order updateOrder(@RequestBody Order order, @PathVariable Long id) {
     //   order.setId(id);
        return orderService.updateOrder(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
    }
}

