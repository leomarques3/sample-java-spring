package com.sample.sample.java.spring.domain.customer.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/example")
public class CustomerController {

    @GetMapping("/test")
    public ResponseEntity<Void> testLog() {
        log.info("test info");
        log.debug("test debug");
        log.trace("test trace");
        log.error("test error");
        log.warn("test warn");
        return ResponseEntity.ok().build();
    }

}
