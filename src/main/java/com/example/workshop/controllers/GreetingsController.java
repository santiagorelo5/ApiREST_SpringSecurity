package com.example.workshop.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingsController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        System.out.println("holaaa");
        return ResponseEntity.ok("hello from our API");
    }

    @GetMapping("/say-good-bye")
    public ResponseEntity<String> sayGoodbye() {
        return ResponseEntity.ok("goodbye from our API");
    }
}
