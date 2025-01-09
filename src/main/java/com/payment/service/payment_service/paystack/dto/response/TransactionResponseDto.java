package com.payment.service.payment_service.paystack.dto.response;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class TransactionResponseDto {
    private Long id;
    private Long userId;
    private String email;
    private String accountId;
    private String authorizationUrl;
    private String authorizationCode;
    private String token;
    private String source;
    private String accessCode;
    private String reference;
    private BigDecimal amount;
    private BigDecimal fee;
    private String status;
    private boolean payed;
    private boolean isTokenized;
    private String narration;
    private LocalDateTime paymentDate;
    private LocalDateTime createdAt;
    private String finalData;
    private String initialData;
}
