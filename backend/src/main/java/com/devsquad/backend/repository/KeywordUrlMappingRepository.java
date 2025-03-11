package com.devsquad.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.devsquad.backend.models.KeywordUrlMapping;

public interface KeywordUrlMappingRepository extends JpaRepository<KeywordUrlMapping,String>{

    @Query("SELECT k.url from KeywordUrlMapping k where k.keyword = :urlkeyword")
    public String getSourceUrl(@Param("urlkeyword")String keyword);

}
