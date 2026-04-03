package com.luminahotel.dto.response;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class RoomCategoryResponse {

    private Long id;
    private String name;
    private String description;
    private BigDecimal basePrice;
    private Integer maxOccupancy;
    private String imageUrl;
    private List<String> amenities;
}