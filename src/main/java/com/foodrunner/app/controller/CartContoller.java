package com.foodrunner.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodrunner.app.entities.Cart;
import com.foodrunner.app.service.CartService;

@RestController
@RequestMapping("/foodRunner/cart")
public class CartContoller {
	
	@Autowired
	CartService cartService;
	
	@PostMapping("/addItem")
	public Cart addCart(Cart cart) {
		return 	cartService.addCart(cart);
	}
	
	@PostMapping("/addItem/{id}")
	public void deleteCart(@PathVariable Long id) {
		 	cartService.deleteCart(id);
	}

}
