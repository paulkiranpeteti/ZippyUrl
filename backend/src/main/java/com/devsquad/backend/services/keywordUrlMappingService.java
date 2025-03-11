package com.devsquad.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsquad.backend.models.KeywordUrlMapping;
import com.devsquad.backend.repository.KeywordUrlMappingRepository;

@Service
public class keywordUrlMappingService {

    @Autowired
    private KeywordUrlMappingRepository keywordUrlMappingRepository;

    public void shorten_url(KeywordUrlMapping keywordUrlMapping){
        keywordUrlMappingRepository.save(keywordUrlMapping);
    }

    public List<KeywordUrlMapping> listAllUrls(){
        return keywordUrlMappingRepository.findAll();
    }

    public String getSourceUrl(String keyword){
        return keywordUrlMappingRepository.getSourceUrl(keyword);
    }
    
}
