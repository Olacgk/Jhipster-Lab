package com.groupeisi.ms2.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorld {
    @GetMapping("/v1/hello2")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello World from Microservice 2");
    }
}
