package com.luminahotel.dto.response;

import com.luminahotel.model.enums.RoomStatus;
import lombok.Data;

@Data
public class RoomResponse {

    private Long id;
    private String roomNumber;
    private Integer floor;
    private RoomCategoryResponse category;
    private RoomStatus status;
    private String notes;
}