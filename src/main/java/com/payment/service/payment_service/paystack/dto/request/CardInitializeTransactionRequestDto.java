package com.payment.service.payment_service.paystack.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CardInitializeTransactionRequestDto {
    private BigDecimal amount;
    @Email
    @NotEmpty(message = "Email is a required field")
    private String email;
    private String reference;
    @JsonProperty(value = "callback_url")
    private String callbackUrl;
    private Integer invoiceLimit;
    @NotNull
    private Long userId;
    @NotNull
    private String accountId;
    private String[] channels = new String[]{"card"};
    private String subAccount;
    private Integer transactionCharge;
    private String paymentBearer;
    private String checksum;
}
