package com.packt.example.clientcredentialsserver.controller;

import com.packt.example.clientcredentialsserver.dto.NotificationDTO;
import com.packt.example.clientcredentialsserver.model.Payment;
import com.packt.example.clientcredentialsserver.service.PaymentService;
import com.packt.example.clientcredentialsserver.utils.PaymentValidationsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.ResponseEntity.badRequest;

@RestController
@RequestMapping("/payments")
public class PaymentController {


    @Autowired
    private PaymentService paymentService;

    @RequestMapping(value = "/payment", method = RequestMethod.POST)
    public ResponseEntity<NotificationDTO> getAllUsers(@Valid @RequestBody Payment payment) {

        if (payment != null && !PaymentValidationsUtils.validate(payment)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        Payment createdPayment = paymentService.create(payment);

        if (payment == null) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }


        return ResponseEntity.ok().body(new NotificationDTO(createdPayment));
    }

}
