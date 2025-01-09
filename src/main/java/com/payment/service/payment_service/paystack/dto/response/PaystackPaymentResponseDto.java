package com.payment.service.payment_service.paystack.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaystackPaymentResponseDto {
    public String id;
    public String domain;
    public String status;
    public String reference;
    public BigDecimal amount;
    public Object message;
    @JsonProperty("gateway_response")
    public String gatewayResponse;
    @JsonProperty(value = "paid_at")
    public Date paidAt;
    @JsonProperty(value = "created_at")
    public Date createdAt;
    public String channel;
    public String currency;
    @JsonProperty(value = "ip_address")
    public String ipAddress;
    public String metadata;
    public BigDecimal fees;
    public Authorization authorization;
    @JsonProperty(value = "fees_split")
    public Object feesSplit;
    public Object plan;
    //    public Split split;
    @JsonProperty(value = "order_id")
    public Object orderId;
    @JsonProperty(value = "requested_amount")
    public BigDecimal requestedAmount;
    @JsonProperty(value = "pos_transaction_data")
    public Object posTransactionData;
    public Object source;
    @JsonProperty(value = "fees_breakdown")
    public Object feesBreakdown;
    @JsonProperty(value = "transaction_date")
    public Date transactionDate;
//    public PlanObject plan_object;
//    public Subaccount subaccount;
//    public String getChecksum(){
//        return Utility.getChecksum(amount + reference );
//    }
}
