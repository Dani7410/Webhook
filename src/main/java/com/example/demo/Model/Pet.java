package com.example.demo.Model;

public class Pet {

    private String pet_name;
    private int pet_age;
    private String owner_name;

    public Pet() {
    }

    public Pet(String pet_name, int pet_age, String owner_name) {
        this.pet_name = pet_name;
        this.pet_age = pet_age;
        this.owner_name = owner_name;
    }

    public String getPet_name() {
        return pet_name;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = pet_name;
    }

    public int getPet_age() {
        return pet_age;
    }

    public void setPet_age(int pet_age) {
        this.pet_age = pet_age;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }
}

