package com.example.attendance_management.controller;

import com.example.attendance_management.dto.UserJoinDto;
import com.example.attendance_management.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @GetMapping("/login")
    public String goToLogin() {
        return "login";
    }

    @GetMapping("/register")
    public String goToJoin() {
        return "register";
    }

    @PostMapping("/register")
    public void join(@RequestBody UserJoinDto userJoinDto) {
        userService.register(userJoinDto);
    }

}
