package com.devsquad.backend.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsquad.backend.models.KeywordUrlMapping;
import com.devsquad.backend.models.User;
import com.devsquad.backend.services.keywordUrlMappingService;
import com.devsquad.backend.services.userservice;

@RestController
@CrossOrigin(origins = {"http://localhost:5741"}) // Best Practice is to define Global CORS Configuration
public class UrlController {

    @Autowired
    private userservice userservice;

    @Autowired
    private keywordUrlMappingService keywordUrlMappingService;

    @GetMapping("/")
    public String home()
    {
        return "Home Page with a Navbar and Login/Signup Route";
    }

    @PostMapping("/login")
    public String userlogin(@RequestParam String username,@RequestParam String password /*,HttpServletRequest request*/) {
        Optional<User> opt = userservice.checkUserLogin(username,password);
        if(opt.isPresent())
        {
            // HttpSession session = request.getSession();
            // session.setAttribute(username, opt.get().getUsername());
            return "LoginSuccessful";
        }
        else
            return "InvalidCredentials";
    }

    @PostMapping("/register")
    public String userregister(@RequestBody User user) {
        userservice.insertUser(user);
        return "User Added Successfully";
    }

    @GetMapping("/getallusers")
    public List<User> listallusers(){
        return userservice.viewallUsers();
    }

    // @GetMapping("passcode")
    // public List<User> getbypasscode(){
    //     return userservice.retriveUsers();
    // }
    

    @GetMapping("/home")
    public String getMethodName() {
       return "Home page of the user";
    }
    
    @PostMapping("/shortenurl")
    public String shorten_url(@RequestBody KeywordUrlMapping keywordUrlMapping) {
        keywordUrlMappingService.shorten_url(keywordUrlMapping);
        return "Shortened the URL Successfully";
    }
    
    @GetMapping("/viewallurls")
    public List<KeywordUrlMapping> viewallurls() {
        return keywordUrlMappingService.listAllUrls();
    }
}
