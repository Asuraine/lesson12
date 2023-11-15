package ru.sbgeu.lichman.basic;

import static ru.sbgeu.lichman.basic.Cat.*;

public class MainApl {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Добби", 30),
                new Cat("Оскар", 40),
                new Cat("Жорик", 20),
                new Cat("Чез", 10)};

        Plate plate = new Plate(30, 70);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].isHungry == true && cats[i].appetite < plate.food) {
                cats[i].catHunger(plate);
                System.out.println("Котик " + cats[i].name + " покушал!");
            } else {
                System.out.println("Котик " + cats[i].name + " не поел!");
            }


        }
    }
}





