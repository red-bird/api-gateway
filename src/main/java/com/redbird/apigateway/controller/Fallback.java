package com.redbird.apigateway.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/fallbacks")
public class Fallback {

    @PostMapping("/shopFallback")
    public Mono<String> shopFallback() {
        return Mono.just("shops-service unhealthy... Please try again later");
    }

    @PostMapping("/purchaseFallback")
    public Mono<String> purchaseFallback() {
        return Mono.just("purchase-service unhealthy... Please try again later");
    }

    @PostMapping("/factoryFallback")
    public Mono<String> factoryFallback() {
        return Mono.just("factory-service unhealthy... Please try again later");
    }
}