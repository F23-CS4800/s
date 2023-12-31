package com.lookout.service.controller;

import com.lookout.service.models.Greeting;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class IController
{

    @GetMapping("/message")
    public Greeting getMessage(@RequestParam(name = "message", defaultValue = "Hello, world!") String message) {
        return new Greeting(message);
    }

}
