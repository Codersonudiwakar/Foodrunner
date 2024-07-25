package com.foodrunner.app.service;

import java.util.List;

import com.foodrunner.app.entities.Order;

public interface OrderService {
	
	 public Order saveOrder(Order order) ;
	 
	    public List<Order> getAllOrders() ;
	    

	    public Order getOrderById(Long id) ;
	    
	    public List<Order> getOrdersByUserId(Long userId) ;
	    

	    public Order updateOrder(Order order);

	    public void deleteOrder(Long id) ;
	    

}
