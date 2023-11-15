package ru.sbgeu.lichman.basic;

public class Cat {

    String name;
    int appetite;
    boolean isHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }

    public boolean catHunger(Plate plate) {
        if (isHungry && plate.decreaseFood(appetite)) {
            isHungry = false;
            return true;
        }
        return false;

    }

    public void info() {
        System.out.println(name + " имеет аппетит " + appetite + ".\n" + name + " приступает к еде.");
    }
}
