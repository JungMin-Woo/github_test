package com.codestates.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationsController {

    @GetMapping("/")
    public String helloWorld(){
        return "To-do Application";
    }
}
