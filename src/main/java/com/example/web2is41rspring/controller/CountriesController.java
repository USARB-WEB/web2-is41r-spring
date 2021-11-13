package com.example.web2is41rspring.controller;

import com.example.web2is41rspring.model.Country;
import com.example.web2is41rspring.repository.CountriesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CountriesController {

    CountriesRepository countriesRepository = new CountriesRepository();

    @PostMapping("countries")
    public String create(@RequestBody Country country){
        return this.countriesRepository.create(country);
    }

    @GetMapping("countries")
    public String read(){
        return this.countriesRepository.read();
    }

    @GetMapping("countries/{id}")
    public String read(@PathVariable int id){
        return this.countriesRepository.read(id);
    }

    @PutMapping("countries/{id}")
    public String update(@PathVariable int id, @RequestBody Country country){
        return this.countriesRepository.update(id, country);
    }

    @DeleteMapping("countries/{id}")
    public String delete(@PathVariable int id){
        return this.countriesRepository.delete(id);
    }
}
