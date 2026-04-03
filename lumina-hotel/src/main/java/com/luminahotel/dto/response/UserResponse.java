package com.luminahotel.dto.response;

import com.luminahotel.model.enums.Role;
import lombok.Data;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@Data
public class UserResponse {

    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private LocalDate dateOfBirth;
    private Role role;
    private boolean active;
    private Instant createdAt;
}