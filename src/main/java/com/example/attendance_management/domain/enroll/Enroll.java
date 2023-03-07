package com.example.attendance_management.domain.enroll;

import com.example.attendance_management.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Enroll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @OneToOne
    private User user;

    @Column
    private LocalDateTime at;

    @Column
    private Boolean approval;

}
