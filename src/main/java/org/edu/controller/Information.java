package org.edu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Information {

    @GetMapping("/")
    public String getInfo() {
        return "Hi! I am Prashant and this is my first Project";
    }

}
