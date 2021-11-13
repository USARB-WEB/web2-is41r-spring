package com.example.web2is41rspring.controller;

import com.example.web2is41rspring.model.Country;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CountriesController {

    ArrayList<Country> countries = new ArrayList<>();

    @PostMapping("countries")
    public String create(@RequestParam String name){
        Country country = new Country(name);
        this.countries.add(country);
        return "Created";
    }

    @GetMapping("countries")
    public String read(){
        return this.countries.toString();
    }

    @GetMapping("countries/{id}")
    public String read(@PathVariable int id){
        return this.countries.get(id).toString();
    }

    @PutMapping("countries/{id}")
    public String update(@PathVariable int id, @RequestParam String name){
        Country country = new Country(name);
        this.countries.set(id, country);
        return "Updated";
    }

    @DeleteMapping("countries/{id}")
    public String delete(@PathVariable int id){
        this.countries.remove(id);
        return "Deleted";
    }
}
