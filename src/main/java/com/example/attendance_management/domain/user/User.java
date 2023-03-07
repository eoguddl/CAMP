package com.example.attendance_management.domain.user;

import com.example.attendance_management.domain.enums.Department;
import com.example.attendance_management.domain.enums.Position;
import com.example.attendance_management.domain.enums.Role;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String role;

    private String department;

    private String position;

    private Boolean approval;

}
