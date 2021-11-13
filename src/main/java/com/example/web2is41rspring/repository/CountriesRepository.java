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

    public String read(int id){
        try{
            return this.countries.get(id).toString();
        } catch (Exception e){
            return e.toString();
        }
    }

    public String update(int id, Country country){
        try {
            this.countries.set(id, country);
            return "Updated";
        } catch (Exception e) {
            return e.toString();
        }
    }

    public String delete(int id){
        try {
            this.countries.remove(id);
            return "Deleted";
        } catch (Exception e){
            return e.toString();
        }
    }
}
