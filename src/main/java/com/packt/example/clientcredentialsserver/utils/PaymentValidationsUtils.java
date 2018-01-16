package com.packt.example.clientcredentialsserver.utils;


import com.packt.example.clientcredentialsserver.model.Payment;
import org.apache.commons.validator.routines.EmailValidator;

public class PaymentValidationsUtils {
    public static boolean validate(Payment payment){
        if(payment==null){
            throw new NullPointerException("Payment must be not null");
        }
        return checkInputEmail(payment.getPayer().getEmail());
    }

    private static boolean checkInputEmail(String email){
        return  EmailValidator.getInstance().isValid(email);
    }
}
