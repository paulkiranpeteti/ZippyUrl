package com.devsquad.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsquad.backend.models.User;

public interface UserRepository extends JpaRepository<User,String> {

    // Create Get Update Delete findAll findbyUId

    // @Query("SELECT u FROM User u WHERE u.password = :password")
    // List<User> getUsers(@Param("password") String password);

    @Query("SELECT u from User u WHERE u.username = ?1 AND u.password= ?2")
    public Optional<User> checkUserCredentials(String username,String password);

}
