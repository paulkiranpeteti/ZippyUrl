package com.devsquad.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsquad.backend.models.User;

public interface UserRepository extends JpaRepository<User,String> {

    // Create Get Update Delete findAll findbyUId

    // @Query("SELECT u FROM User u WHERE u.password = :password")
    // List<User> getUsers(@Param("password") String password);

}
