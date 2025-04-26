package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Payment;
import com.example.demo.repository.PaymentRepository;

@Service
public class PaymentService {

    private final PaymentRepository repo;

    public PaymentService(PaymentRepository repo) {
        this.repo = repo;
    }

    public Payment makePayment(Double amount, String method) {
        Payment payment = new Payment(amount, method);
        return repo.save(payment);
    }
}
