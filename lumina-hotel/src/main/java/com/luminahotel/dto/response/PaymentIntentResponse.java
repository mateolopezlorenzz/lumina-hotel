package com.luminahotel.dto.response;

import lombok.Data;

@Data
public class PaymentIntentResponse {

    private String clientSecret;
    private String paymentIntentId;
}