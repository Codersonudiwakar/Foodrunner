package com.foodrunner.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodrunner.app.entities.FoodItem;
import com.foodrunner.app.service.FoodItemService;

@RestController
public class FoodItemController {
	
	@Autowired
	private FoodItemService foodService;
	
    @PostMapping("/aadFood")
    public FoodItem createMenu(@RequestBody FoodItem menu) {
        return foodService.addFoodItem(menu);
    }

    @GetMapping("/{category}")
    public List<FoodItem> getMenuById(@PathVariable String category) {
        return foodService.getFoodByCategory(category);
    }

}
