package com.packt.example.clientcredentialsserver.service;

import com.packt.example.clientcredentialsserver.model.Payment;
import com.packt.example.clientcredentialsserver.model.State;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class PaymentService {

    public Payment create(Payment payment) {
            payment.setCreated(LocalDateTime.now());
            payment.setState(State.CREATED);
            payment.setId("1231029480YUHIBUHY");

            return payment;
    }
}
