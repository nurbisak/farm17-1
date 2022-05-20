package com.animal;

public class Horse extends  Animal{
private String color;

    public Horse(String name, int age, int weight, String gender, String color) {
        super(name, age, weight, gender);
        this.color=color;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
