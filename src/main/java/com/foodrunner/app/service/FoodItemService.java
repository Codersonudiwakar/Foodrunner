package com.foodrunner.app.service;

import java.util.List;

import com.foodrunner.app.entities.FoodItem;

public interface FoodItemService {
	FoodItem addFoodItem(FoodItem foodItem);
	List<FoodItem> getFoodByCategory(String category);

}
