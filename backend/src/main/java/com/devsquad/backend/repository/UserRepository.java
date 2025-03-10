package com.devsquad.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsquad.backend.models.User;

public interface UserRepository extends JpaRepository<User,String> {

}
