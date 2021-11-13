package com.example.web2is41rspring.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CountriesController {

    ArrayList<String> countries = new ArrayList<>();

    @PostMapping("countries")
    public String create(@RequestParam String name){
        this.countries.add(name);
        return "Created";
    }

    @GetMapping("countries")
    public String read(){
        return this.countries.toString();
    }

    @PutMapping("countries/{id}")
    public String update(@PathVariable int id, @RequestParam String name){
        this.countries.set(id, name);
        return "Updated";
    }

    @DeleteMapping("countries/{id}")
    public String delete(@PathVariable int id){
        this.countries.remove(id);
        return "Deleted";
    }
}
