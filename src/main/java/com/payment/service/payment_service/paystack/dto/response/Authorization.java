package com.payment.service.payment_service.paystack.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Authorization {
    @JsonProperty(value = "authorization_code")
    public String authorizationCode;
    public String bin;
    public String last4;
    @JsonProperty(value = "exp_month")
    public String expMonth;
    @JsonProperty(value = "exp_year")
    public String expYear;
    public String channel;
    @JsonProperty(value = "card_type")
    public String cardType;
    public String bank;
    @JsonProperty(value = "country_code")
    public String countryCode;
    public String brand;
    public boolean reusable;
    public String signature;
    @JsonProperty(value = "account_name")
    public Object accountName;
}
