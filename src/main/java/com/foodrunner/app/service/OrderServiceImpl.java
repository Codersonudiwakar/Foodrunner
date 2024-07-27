package com.foodrunner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.foodrunner.app.Repository.OrderRepository;
import com.foodrunner.app.entities.Order;
import com.foodrunner.app.entities.OrderItem;

public class OrderServiceImpl implements OrderService {
	
	
	@Autowired
	OrderRepository orderRepo;

	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepo.save(order);
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepo.findAll();
	}

	@Override
	public Order getOrderById(Long id) {
		// TODO Auto-generated method stub
		return orderRepo.getById(id);
	}

	@Override
	public List<Order> getOrdersByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepo.save(order);
	}

	@Override
	public void deleteOrder(Long id) {
		// TODO Auto-generated method stub
		orderRepo.deleteById(id);
		
	}



}
