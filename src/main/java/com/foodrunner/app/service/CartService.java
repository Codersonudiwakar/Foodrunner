package com.foodrunner.app.service;

import com.foodrunner.app.entities.Cart;
import com.foodrunner.app.entities.FoodItem;

public interface CartService {
	
 public	Cart addCart(Cart cart);
	
 public void deleteCart(Long id);
	
	

}
