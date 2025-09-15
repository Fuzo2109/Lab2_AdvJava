package com.example.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
        public String sayHello() {
        return "Hello, Spring Boot!";
        }
    @GetMapping("/info")
        public Map<String, String> getInfo() {
        return Map.of(
        "course", "Advanced Java Programming",
        "class", "251_72ITDS30103_01",
        "student", "Vo Ngoc Phu"
        );
    }
}