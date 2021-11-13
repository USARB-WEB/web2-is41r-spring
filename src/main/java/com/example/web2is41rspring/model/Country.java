package com.example.web2is41rspring.model;

public class Country {
    private int id;
    private String name;
    private float area;

    public Country(String name){
        this.name = name;
    }

    public Country(int id, String name, float area) {
        this.id = id;
        this.name = name;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
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
