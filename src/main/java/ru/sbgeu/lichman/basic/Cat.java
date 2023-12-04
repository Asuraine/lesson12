package ru.sbgeu.lichman.basic;

import java.security.PublicKey;

public class Cat {

    private String name;
    private int appetite;
    private boolean isHungry;

    public String getName () {
        return name;
    }
    public int getAppetite () {
        return appetite; }

     public boolean getIsHungry () {
        return isHungry;
    }

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
