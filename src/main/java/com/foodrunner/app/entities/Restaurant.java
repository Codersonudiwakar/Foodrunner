package com.foodrunner.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<Menu> menus;

    // getters and setters
}

