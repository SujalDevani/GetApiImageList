package com.example.apidemo;

public class Model {

    String id, name, year, color, avatarUrl;

    // Empty constructor
    public Model() {
    }

    // Constructor
    public Model(String id, String name, String year, String color, String avatarUrl) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.color = color;
        this.avatarUrl = avatarUrl;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
