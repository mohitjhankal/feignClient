package com.feign.microserviceB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MicroserviceBController {

    @GetMapping("/resourceB")
    public String getResourceB() {
        // Logic to get data for Microservice B
        return "Data from Microservice B";
    }
}

