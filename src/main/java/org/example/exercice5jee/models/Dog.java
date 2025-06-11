package org.example.exercice5jee.models;

import java.time.LocalDate;

public class Dog {
    private int id;
    private String name;
    private String breed;
    private LocalDate birthday;
    Dog(String name, String breed, LocalDate birthday) {
        this.id = id++;
        this.name = name;
        this.breed = breed;
        this.birthday = birthday;
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
