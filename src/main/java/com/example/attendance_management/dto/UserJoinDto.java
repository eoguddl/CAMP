package com.example.attendance_management.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserJoinDto {

    private String name;

    private String username;

    private String password;

    private String department;

    private String position;

}
