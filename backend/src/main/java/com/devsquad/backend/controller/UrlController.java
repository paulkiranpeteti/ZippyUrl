package com.devsquad.backend.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {

    @GetMapping("/")
    public String check()
    {
        return "Welcome to the Application";
    }
    
}
