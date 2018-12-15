package com.movitracker.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackController {

    @GetMapping(path = "/hello")
    public String hello(@RequestParam String name) {
        return "hello " + name;
    }
}
