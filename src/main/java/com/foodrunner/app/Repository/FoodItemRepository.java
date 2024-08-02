package com.foodrunner.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodrunner.app.entities.FoodItem;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
	
	List<FoodItem> findByFoodCategory(String foodCategory);

}
