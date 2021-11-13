package com.example.web2is41rspring.model;

public class Country {
    int id;
    String name;
    float area;

    public Country(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
