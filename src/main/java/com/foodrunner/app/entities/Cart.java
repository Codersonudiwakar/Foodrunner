package com.foodrunner.app.entities;

import jakarta.persistence.*;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cartId;
	private Long userId;
	
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "food_Id", referencedColumnName = "foodId")
	private FoodItem foodItem;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(Long cartId, Long userId, FoodItem foodItem) {
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.foodItem = foodItem;
	}

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public FoodItem getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(FoodItem foodItem) {
		this.foodItem = foodItem;
	}
	 
	

}
