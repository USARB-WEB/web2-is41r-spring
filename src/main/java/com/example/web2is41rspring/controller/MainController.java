package com.example.web2is41rspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping(path = "/")
    public String mainPage(){
        return "Hello world from Springboot";
    }

    @GetMapping(path = "test")
    public String testResource(){
        return "This is a test resource";
    }

    @GetMapping(path = "number/{n}")
    public String showNumber(@PathVariable String n){
        return n;
    }
}
