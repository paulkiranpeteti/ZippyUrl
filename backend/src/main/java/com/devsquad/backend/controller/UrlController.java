package com.devsquad.backend.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UrlController {

    @GetMapping("/")
    public String home()
    {
        return "Home Page with a Navbar and Login/Signup Route";
    }

    @GetMapping("/login")
    public String userlogin() {
        return "Login Page which consists of username and password";
    }

    @GetMapping("/register")
    public String userregister() {
        return "User Registration Page with its fields";
    }

    @GetMapping("/home")
    public String getMethodName() {
       return "Home page of the user";
    }
    
    @GetMapping("/shortenurl")
    public String shorten_url() {
        return "Page for Shortening the URL";
    }
    
    @GetMapping("viewallurls")
    public String viewallurls() {
        return "display all the information about the urls based the username";
    }
}
