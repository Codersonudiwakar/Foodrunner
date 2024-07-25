package com.foodrunner.app.service;

import java.util.List;

import com.foodrunner.app.entities.Payment;

public interface PaymentService {
	
	public Payment savePayment(Payment payment) ;
	
    public List<Payment> getAllPayments() ;
    

    public Payment getPaymentById(Long id);
    
    public Payment updatePayment(Payment payment) ;
    

    public void deletePayment(Long id) ;



}
