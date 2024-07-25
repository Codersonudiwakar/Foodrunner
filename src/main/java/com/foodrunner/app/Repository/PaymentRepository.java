package com.foodrunner.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodrunner.app.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
