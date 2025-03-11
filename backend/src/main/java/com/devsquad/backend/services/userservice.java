package com.devsquad.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsquad.backend.models.User;
import com.devsquad.backend.repository.UserRepository;

@Service
public class userservice {

    @Autowired
    private UserRepository userRepository;

    public void insertUser(User user){
        userRepository.save(user);
    }

    public List<User> viewallUsers(){
        return userRepository.findAll();
    }

    public Optional<User> checkUserLogin(String username,String password)
    {
        return userRepository.checkUserCredentials(username, password);
    }


    // public List<User> retriveUsers(){
    //     return userRepository.getUsers("root");
    // }
    
}
