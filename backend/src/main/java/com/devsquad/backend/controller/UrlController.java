package com.devsquad.backend.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devsquad.backend.models.User;
import com.devsquad.backend.services.userservice;

@RestController
public class UrlController {

    @Autowired
    private userservice userservice;

    @GetMapping("/")
    public String home()
    {
        return "Home Page with a Navbar and Login/Signup Route";
    }

    @GetMapping("/login")
    public String userlogin() {
        return "Login Page which consists of username and password";
    }

    @PostMapping("/register")
    public String userregister(@RequestBody User user) {
        userservice.insertUser(user);
        return "Added the User";
    }

    @GetMapping("/getallusers")
    public List<User> listallusers(){
        return userservice.viewallUsers();
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
