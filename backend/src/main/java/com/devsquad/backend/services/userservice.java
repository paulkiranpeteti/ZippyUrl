package com.devsquad.backend.services;

import java.util.List;

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


    // public List<User> retriveUsers(){
    //     return userRepository.getUsers("root");
    // }
    
}
