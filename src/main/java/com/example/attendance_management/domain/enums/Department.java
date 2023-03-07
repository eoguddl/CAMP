package com.example.attendance_management.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor // 부서
public enum Department {

    buseo1("1"),

    buseo2("2"),

    buseo3("3"),

    buseo4("4");

    private final String name;

}
