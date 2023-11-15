package ru.sbgeu.lichman.basic;

public class Plate {
    int food;
    int foodMax;

    public Plate(int food, int foodMax) {
        this.food = food;
        this.foodMax = foodMax;
    }

    public boolean decreaseFood(int amountDecr) {
        int diffFood = food - amountDecr;
        if (food - amountDecr >= 0) {
            food = diffFood;
            return true;
        }
        if (diffFood < 0) {
            food = 0;
            System.out.println("В тарелке нет корма");
        }
        return false;

    }

    public int addFood(int eat) {
        if (food + eat > foodMax) {
            food = foodMax;
            System.out.println("У вас нет места в тарелке");
        }
        if (food < foodMax) {
            food = foodMax + eat;
            System.out.println("В тарелку добавилась еда, теперь она содержит: " + food);
        }
        return foodMax;
    }

    public void info() {
        System.out.println("Тарелка содержит " + food);
    }
}
