package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class AboutPageController {
    @GetMapping("/mainscreen")
    public String mainScreen() {
        return "mainscreen";
    }
}
