package com.feign.microserviceA.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "microservice-b", url = "http://localhost:8001")
public interface MicroserviceBClient {

    @GetMapping("/api/resourceB")
    String getResourceB();

}
