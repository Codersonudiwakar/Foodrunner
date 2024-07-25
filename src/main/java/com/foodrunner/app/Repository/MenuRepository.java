package com.foodrunner.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodrunner.app.entities.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}

