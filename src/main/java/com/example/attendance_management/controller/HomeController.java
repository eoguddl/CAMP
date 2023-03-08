package com.example.attendance_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeController {

    @GetMapping("/")
    public String goToHome(Model model, Principal principal) {
        System.out.println("user: " + principal.getName());
        model.addAttribute("user", principal);
        return "index";
    }

}
