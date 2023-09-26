package com.example.service.controller;

import com.example.service.models.Greeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class IController
{

    @GetMapping("/message")
    public Greeting getMessage(@RequestParam(name = "message", defaultValue = "Hello, world!") String message) {
        return new Greeting(message);
    }

}
