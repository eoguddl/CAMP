package com.example.attendance_management.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Position {

    INTERN("인턴"),

    STAFF("사원"),

    ASSISTANT_MANAGER("대리"),

    MANAGER("과장"),

    DEPUTY_GENERAL_MANAGER("차장"),

    GENERAL_MANAGER("부장"),

    EXECUTIVES("임원");

    private final String name;

}
