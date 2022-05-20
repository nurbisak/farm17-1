package com.animal;

public class Main {

    public static void main(String[] args) {
       /* Класс Cow (weight, age, gender, nickName)
±Класс Sheep(weight, age, gender, nickName)
±Класс Horse(weight, age, color, gender, nickName)
±Класс Farm(address, cows, horses, sheep, OwnerName)
±2 Farm тузунуз.
±1-Farmда 3 sheep, 5 cows, 2 horses болсун.
±2-Farmда 1 sheep, 1 cow, 1 horse болсун.

        */

        Sheep sheep = new Sheep("kochkor1", 3, 25, "kochkor");
        Sheep sheep1 = new Sheep("koi2", 8, 25, "koi");
        Sheep sheep2 = new Sheep("kochkor3", 5, 25, "kochkor");
        Sheep sheep3 = new Sheep("koi4", 6, 25, "koi");

        Cow cow = new Cow("masha", 5, 70, "uy");
        Cow cow1 = new Cow("boika", 8, 70, "bull");
        Cow cow2 = new Cow("bella", 3, 40, "uy");
        Cow bull3 = new Cow("oguz", 9, 100, "bull");
        Cow cow4 = new Cow("nastya", 5, 70, "uy");
        Cow bull5 = new Cow("buka", 10, 110, "bull");

        Horse horse = new Horse("akkashka", 7, 90, "aigyr", "white");
        Horse horse1 = new Horse("zorro", 9, 90, "bee", "black");
        Horse horse2 = new Horse("terminator", 8, 90, "aigyr", "white");

        Farm farm1 = new Farm();
        farm1.setAddress("savhoz frunze");
        farm1.setOwnerName(" Kojoyunka Kojoyunova");
        farm1.setSheeps(new Sheep[]{sheep1, sheep, sheep2});
        farm1.setCows(new Cow[]{cow, cow2, cow4, bull3, bull5});
        farm1.setHorses(new Horse[]{horse, horse2});
        System.out.println(farm1);
        System.out.println("*****************************************************");

        Farm farm2 = new Farm();
        farm2.setAddress("rezidenciya Bishkek");
        farm2.setOwnerName("unknown");
        farm2.setSheeps(new Sheep[]{sheep3});
        farm2.setCows(new Cow[]{cow1});
        farm2.setHorses(new Horse[]{horse1});

        System.out.println(farm2);


    }
}
