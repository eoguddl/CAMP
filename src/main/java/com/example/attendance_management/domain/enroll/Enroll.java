package com.example.attendance_management.domain.enroll;

import com.example.attendance_management.domain.user.Member;
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

    @OneToOne
    private Member member;

    @Column
    private LocalDateTime at;

    @Column
    private Boolean approval;

}
