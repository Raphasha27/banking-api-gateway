package com.banking.bankingapigateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class GatewayController {
    @GetMapping("/health")
    public ResponseEntity<Map<String, String>> health() {
        return ResponseEntity.ok(Map.of("status", "UP", "service", "banking-api-gateway"));
    }

    @GetMapping("/api/v1/routes")
    public ResponseEntity<Map<String, Object>> listRoutes() {
        return ResponseEntity.ok(Map.of(
            "routes", new String[]{
                "/api/v1/customers -> customer-service",
                "/api/v1/accounts -> account-service",
                "/api/v1/transactions -> transaction-service",
                "/api/v1/loans -> loan-service",
                "/api/v1/auth -> auth-service"
            },
            "version", "0.1.0"
        ));
    }
}
