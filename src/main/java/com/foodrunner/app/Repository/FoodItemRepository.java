package com.foodrunner.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.foodrunner.app.entities.FoodItem;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
	
	List<FoodItem> findByFoodCategory(String foodCategory);
	
	@Query("SELECT f FROM FoodItem f WHERE f.foodName LIKE %:keyword% " +
	           "OR f.foodCategory LIKE %:keyword% " +
	           "OR f.foodRestaurant LIKE %:keyword%")
	    List<FoodItem> findByKeyword(@Param("keyword") String keyword);

}
