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
    
	public Address(Long addressId, String homeNo, String area, String city, String landmark, String state, long zip) {
		super();
		this.addressId = addressId;
		this.homeNo = homeNo;
		this.area = area;
		this.city = city;
		this.landmark = landmark;
		this.state = state;
		this.zip = zip;
	}
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
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	

}
