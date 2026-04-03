package com.luminahotel.dto.response;

import lombok.Data;

import java.time.Instant;
import java.time.LocalDate;

@Data
public class RoomBlockResponse {

    private Long id;
    private Long roomId;
    private String roomNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;
    private String createdBy;
    private Instant createdAt;
}