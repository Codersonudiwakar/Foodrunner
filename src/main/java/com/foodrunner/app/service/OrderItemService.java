package com.foodrunner.app.service;

import java.util.List;

import com.foodrunner.app.entities.Order;
import com.foodrunner.app.entities.OrderItem;

public interface OrderItemService {
	
	public OrderItem saveOrderItem(OrderItem orderItem) ;

    public List<OrderItem> getAllOrderItems() ;

    public OrderItem getOrderItemById(Long id) ;

    public OrderItem updateOrderItem(OrderItem orderItem) ;

    public void deleteOrderItem(Long id);

}
