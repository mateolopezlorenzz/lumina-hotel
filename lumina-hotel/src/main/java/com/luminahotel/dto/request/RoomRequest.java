package com.luminahotel.dto.request;

import com.luminahotel.model.enums.RoomStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RoomRequest {

    @NotBlank
    private String roomNumber;

    @NotNull
    private Integer floor;

    @NotNull
    private Long categoryId;

    @NotNull
    private RoomStatus status;

    private String notes;
}