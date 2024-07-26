package com.foodrunner.app.controller;
import java.util.*;
import org.springframework.web.bind.annotation.*;

import com.foodrunner.app.entities.OrderItem;
import com.foodrunner.app.service.OrderItemService;

import org.springframework.beans.factory.annotation.*;

@RestController
@RequestMapping("/api/orderItems")
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;

    @PostMapping
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.saveOrderItem(orderItem);
    }

    @GetMapping
    public List<OrderItem> getAllOrderItems() {
        return orderItemService.getAllOrderItems();
    }

    @GetMapping("/{id}")
    public OrderItem getOrderItemById(@PathVariable Long id) {
        return orderItemService.getOrderItemById(id);
    }

    @PutMapping("/{id}")
    public OrderItem updateOrderItem(@RequestBody OrderItem orderItem, @PathVariable Long id) {
    //    orderItem.setId(id);
        return orderItemService.updateOrderItem(orderItem);
    }

    @DeleteMapping("/{id}")
    public void deleteOrderItem(@PathVariable Long id) {
        orderItemService.deleteOrderItem(id);
    }
}

