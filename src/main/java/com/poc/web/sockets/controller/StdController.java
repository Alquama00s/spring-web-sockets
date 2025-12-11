package com.poc.web.sockets.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/std")
public class StdController {

    @PostMapping("/hi")
    public Map<String, Object> sayHi(@RequestBody Map<String, Object> payload) {
        Objects.requireNonNull(payload, "Payload must not be null");
        return Map.of("message", "Hi from StdController", "payload", payload);
    }

}
