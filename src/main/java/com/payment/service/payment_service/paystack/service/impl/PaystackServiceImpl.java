package com.payment.service.payment_service.paystack.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@AllArgsConstructor
public class PaystackServiceImpl{
    public String initiatePayment(int request) {

        return "Test";
    }
}
