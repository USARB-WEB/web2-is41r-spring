package com.example.web2is41rspring.repository;

import com.example.web2is41rspring.model.Country;

import java.util.ArrayList;

public class CountriesRepository {

    ArrayList<Country> countries = new ArrayList<>();
    public String create(Country country){
        this.countries.add(country);
        return "Created";
    }

    public String read(){
        return this.countries.toString();
    }

    public String read(Integer id){
        try{
            return (this.countries.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null)).toString();
        } catch (Exception e){
            return "Resource not found";
        }
    }

    public String update(Integer id, Country country){
        try {
            Country countryFounded = this.countries.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            countryFounded.setName(country.getName());
            countryFounded.setArea(country.getArea());
            return "Updated";
        } catch (Exception e) {
            return "Resource not found";
        }
    }

    public String delete(Integer id){
        try {
            Country country = this.countries.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            if(country == null){
                return "Resource not found";            }
            this.countries.remove(country);
            return "Country deleted";
        } catch (Exception e){
            return "Resource not found";
        }
    }
}
