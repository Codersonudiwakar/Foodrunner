package com.foodrunner.app.controller;
import java.util.*;
import org.springframework.web.bind.annotation.*;

import com.foodrunner.app.entities.Restaurant;
import com.foodrunner.app.service.RestaurantService;

import org.springframework.beans.factory.annotation.*;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @PostMapping
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.saveRestaurant(restaurant);
    }

    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("/{id}")
    public Restaurant getRestaurantById(@PathVariable Long id) {
        return restaurantService.getRestaurantById(id);
    }

    @PutMapping("/{id}")
    public Restaurant updateRestaurant(@RequestBody Restaurant restaurant, @PathVariable Long id) {
     //   restaurant.setId(id);
        return restaurantService.updateRestaurant(restaurant);
    }

    @DeleteMapping("/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        restaurantService.deleteRestaurant(id);
    }
}
