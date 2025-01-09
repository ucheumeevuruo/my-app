package com.payment.service.payment_service.paystack.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Validated
@RestController
@RequestMapping(value = "/api/v1/paystack")
public class PaystackController {

    @GetMapping()
    public ResponseEntity<String> initiatePayment() {
        return ResponseEntity.ok("Test");

    }
}
