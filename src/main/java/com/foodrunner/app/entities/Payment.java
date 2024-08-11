package com.foodrunner.app.entities;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
public class Payment {
    @Id
    private String paymentId;
    private Double amount;
    private LocalDateTime paymentDate;
    private String paymentMethod;
    private String paymentStatus;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    

	public Payment() {
		super();
	}

	public Payment(String paymentId, Double amount, LocalDateTime paymentDate, String paymentMethod,
			String paymentStatus, Order order) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.paymentDate = paymentDate;
		this.paymentMethod = paymentMethod;
		this.paymentStatus = paymentStatus;
		this.order = order;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
    
    
    

    // getters and setters
}
