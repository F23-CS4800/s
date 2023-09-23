package com.example.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.models.Greeting;

@RestController
public class Controller {

    @GetMapping("/greeting")
    public String getMessage() {
        return "Hello, world!";
    }
}
