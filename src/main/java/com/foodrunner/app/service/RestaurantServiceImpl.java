package com.foodrunner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.foodrunner.app.Repository.RestaurantRepository;
import com.foodrunner.app.entities.Restaurant;

public class RestaurantServiceImpl implements RestaurantService{
	
	@Autowired
	RestaurantRepository restaurantRepo;

	@Override
	public Restaurant saveRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return restaurantRepo.save(restaurant);
	}

	@Override
	public List<Restaurant> getAllRestaurants() {
		// TODO Auto-generated method stub
		return restaurantRepo.findAll();
	}

	@Override
	public Restaurant getRestaurantById(Long id) {
		// TODO Auto-generated method stub
		return restaurantRepo.getById(id);
	}

	@Override
	public Restaurant updateRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return restaurantRepo.save(restaurant);
	}

	@Override
	public void deleteRestaurant(Long id) {
		// TODO Auto-generated method stub
		restaurantRepo.deleteById(id);
		
	}

}
