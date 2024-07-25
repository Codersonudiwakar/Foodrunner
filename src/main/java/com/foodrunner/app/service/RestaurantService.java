package com.foodrunner.app.service;

import java.util.List;

import com.foodrunner.app.entities.Restaurant;

public interface RestaurantService {
	
	  public Restaurant saveRestaurant(Restaurant restaurant);
	    

	    public List<Restaurant> getAllRestaurants();
	    

	    public Restaurant getRestaurantById(Long id) ;

	    public Restaurant updateRestaurant(Restaurant restaurant) ;
	    

	    public void deleteRestaurant(Long id) ;
	    

}
