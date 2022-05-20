package com.animal;

public class Sheep extends Animal{


    public Sheep(String name, int age, int weight, String gender) {
        super(name, age, weight, gender);
    }

    @Override
    public String toString() {
        return "Sheep " + super.toString();
    }
}
