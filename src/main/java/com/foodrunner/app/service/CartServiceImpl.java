package com.foodrunner.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodrunner.app.Repository.CartRepository;
import com.foodrunner.app.entities.Cart;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	CartRepository cartRepo;

	@Override
	public Cart addCart(Cart cart) {
		return cartRepo.save(cart);
	}

	@Override
	public void deleteCart(Long id) {
		cartRepo.deleteById(id);
		
	}

}
