package com.animal;

public abstract class Animal {
    private String nickName;
    private int age;
    private int weight;
    private String gender;

    public Animal(String name, int age, int weight, String gender) {
        this.nickName = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return nickName;
    }

    public void setName(String name) {
        this.nickName = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "Name = " + nickName + '\'' +
                ", age=" + age +
                ", \nweight=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }
}
