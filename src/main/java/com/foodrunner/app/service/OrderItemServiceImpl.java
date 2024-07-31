package com.foodrunner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodrunner.app.Repository.OrderItemRepository;
import com.foodrunner.app.entities.OrderItem;

@Service
public class OrderItemServiceImpl implements OrderItemService {
	
	@Autowired
	OrderItemRepository orderItemRepo;

	@Override
	public OrderItem saveOrderItem(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return orderItemRepo.save(orderItem);
	}

	@Override
	public List<OrderItem> getAllOrderItems() {
		// TODO Auto-generated method stub
		return orderItemRepo.findAll();
	}

	@Override
	public OrderItem getOrderItemById(Long id) {
		// TODO Auto-generated method stub
		return orderItemRepo.getById(id);
	}

	@Override
	public OrderItem updateOrderItem(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return orderItemRepo.save(orderItem);
	}

	@Override
	public void deleteOrderItem(Long id) {
		// TODO Auto-generated method stub
		orderItemRepo.deleteById(id);
		
	}

}
