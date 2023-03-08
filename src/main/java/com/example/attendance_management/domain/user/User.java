package com.example.attendance_management.domain.user;

import com.example.attendance_management.domain.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.crypto.password.PasswordEncoder;

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

    @Column
    private String name;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String department;

    @Column
    private String position;

    @Column
    private String role;

    @Column
    private Boolean approval;

    public static User createUser(String name, String username,
                            String password, String department,
                            String position, PasswordEncoder passwordEncoder) {
        return new User(null, name, username, passwordEncoder.encode(password), department, position, Role.USER.getKey(), false);
    }

}
