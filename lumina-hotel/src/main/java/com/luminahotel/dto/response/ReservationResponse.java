package com.luminahotel.dto.response;

import com.luminahotel.model.enums.ReservationStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@Data
public class ReservationResponse {

    private UUID id;
    private UserResponse client;
    private RoomResponse room;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private BigDecimal totalPrice;
    private ReservationStatus status;
    private Integer guestsCount;
    private String specialRequests;
    private Instant createdAt;
}