package com.movitracker.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "hello world";
    }
}
