package com.foodrunner.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodrunner.app.Repository.FoodItemRepository;
import com.foodrunner.app.entities.FoodItem;

@Service
public class FoodItemServiceImpl implements FoodItemService {

	@Autowired
	private FoodItemRepository itemRepo;
	
	@Override
	public FoodItem addFoodItem(FoodItem foodItem) {
		return itemRepo.save(foodItem);
	}

	@Override
	public List<FoodItem> getFoodByCategory(String category) {
		List<FoodItem> list=itemRepo.findByFoodCategory(category);
		List<FoodItem> getFoodList=new ArrayList<FoodItem>();
		for (FoodItem foodItem : list) {
			getFoodList.add(foodItem);
		}
		return getFoodList;
	}

	public List<FoodItem> searchFoodItems(String keyword) {
        return itemRepo.findByKeyword(keyword);
    }

}
