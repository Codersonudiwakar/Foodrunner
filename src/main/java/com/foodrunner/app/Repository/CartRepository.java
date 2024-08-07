package com.foodrunner.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodrunner.app.entities.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
