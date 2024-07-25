package com.foodrunner.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodrunner.app.entities.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
