package com.devsquad.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.devsquad.backend.services.keywordUrlMappingService;

@Controller
public class CustomURLController {

    @Autowired
    public keywordUrlMappingService keywordUrlMappingService;

    @GetMapping("jump/{keyword}")
    public RedirectView redirectToSource(@PathVariable String keyword){
        String url = keywordUrlMappingService.getSourceUrl(keyword);
        RedirectView rv = new RedirectView(url);
        return rv;
    }

}
