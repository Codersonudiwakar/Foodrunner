package com.foodrunner.app.controller;

import java.util.*;
import org.springframework.web.bind.annotation.*;

import com.foodrunner.app.entities.Payment;
import com.foodrunner.app.service.PaymentService;

import org.springframework.beans.factory.annotation.*;

@RestController
@RequestMapping("/foodRunner/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.savePayment(payment);
    }

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @GetMapping("/{id}")
    public Payment getPaymentById(@PathVariable Long id) {
        return paymentService.getPaymentById(id);
    }

    @PutMapping("/{id}")
    public Payment updatePayment(@RequestBody Payment payment, @PathVariable Long id) {
    //    payment.setId(id);
        return paymentService.updatePayment(payment);
    }

    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable Long id) {
        paymentService.deletePayment(id);
    }
}

