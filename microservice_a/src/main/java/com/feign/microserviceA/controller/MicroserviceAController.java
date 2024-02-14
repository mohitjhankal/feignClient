package com.feign.microserviceA.controller;

import com.feign.microserviceA.repository.MicroserviceBClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MicroserviceAController {

    @Autowired
    private MicroserviceBClient microserviceBClient;

    @GetMapping("/resourceA")
    public String getResourceA() {
        // Call Microservice B using Feign client
        String resourceBData = microserviceBClient.getResourceB();

        // Process data and return result
        return "ResourceA Data, and " + resourceBData;
    }
}

