package com.devsquad.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsquad.backend.models.KeywordUrlMapping;

public interface KeywordUrlMappingRepository extends JpaRepository<KeywordUrlMapping,String>{

}
