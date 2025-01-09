package com.payment.service.payment_service.paystack.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class PaystackBalRespDTO {

    private String status;
    private String message;
    private List<PaystackDataDTO> data;

    @Getter
    @Setter
    public static class PaystackDataDTO{
        private String currency;
        private String balance;

    }
}
