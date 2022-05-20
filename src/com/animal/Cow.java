package com.animal;

public class Cow extends Animal {


    public Cow(String name, int age, int weight, String gender) {
        super(name, age, weight, gender);
    }

    @Override
    public String toString() {
        return "Cow" + super.toString();
    }
}
