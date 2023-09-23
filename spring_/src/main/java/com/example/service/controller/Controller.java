package com.example.service.controller;

import com.example.service.models.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {



    @GetMapping("/message")
    public Greeting getMessage(@RequestParam(name = "message", defaultValue = "Hello, world!") String message) {
        return new Greeting(message);
    }

}
