package com.foodrunner.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @Column(name = "home_no")
    private String homeNo;

    @Column(name = "area")
    private String area;

    @Column(name = "city")
    private String city;

    @Column(name = "landmark")
    private String landmark;

    @Column(name = "state")
    private String state;

    @Column(name = "zip")
    private String zip;

    public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getHomeNo() {
		return homeNo;
	}

	public void setHomeNo(String homeNo) {
		this.homeNo = homeNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	// No-args constructor
    public Address() {
    }

    // Existing constructor
    public Address(Long addressId, String homeNo, String area, String city, String landmark, String state, String zip) {
        this.addressId = addressId;
        this.homeNo = homeNo;
        this.area = area;
        this.city = city;
        this.landmark = landmark;
        this.state = state;
        this.zip = zip;
    }

    // Getters and setters (update zip to String if you change the type)
    // ...
}
