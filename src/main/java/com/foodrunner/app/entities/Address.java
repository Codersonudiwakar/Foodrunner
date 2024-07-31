package com.foodrunner.app.entities;

import jakarta.persistence.Id;

public class Address {
	
	@Id
	private Long addressId;
    private String homeNo;
    private String area;
    private String city;
    private String landmark;
    private String state;
    private long zip;
	

}
