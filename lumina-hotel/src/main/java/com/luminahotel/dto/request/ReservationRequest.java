package com.luminahotel.dto.request;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ReservationRequest {

    @NotNull
    private Long roomId;

    @NotNull
    @Future
    private LocalDate checkIn;

    @NotNull
    @Future
    private LocalDate checkOut;

    @NotNull
    @Min(1)
    private Integer guestsCount;

    private String specialRequests;
}