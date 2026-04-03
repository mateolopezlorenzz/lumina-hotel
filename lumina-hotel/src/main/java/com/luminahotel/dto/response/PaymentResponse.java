package com.luminahotel.dto.response;

import com.luminahotel.model.enums.PaymentStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Data
public class PaymentResponse {

    private UUID id;
    private UUID reservationId;
    private String stripePaymentIntentId;
    private BigDecimal amount;
    private String currency;
    private PaymentStatus status;
    private Instant paidAt;
}