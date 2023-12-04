package ru.sbgeu.lichman.basic;

public class Plate {
    private int food;
    private int foodMax;

    public int getFoodMax() { return foodMax;}

    public Plate(int food, int foodMax) {
        this.food = food;
        this.foodMax = foodMax;
    }

    public boolean decreaseFood(int amountDecr) {
        if (this.foodMax < food) {
            return false;
        } else {
            this.foodMax -= food;
            return true;
        }
    }

    public int addFood(int eat) {
        if (food + eat > foodMax) {
            food = foodMax;
            System.out.println("в тарелку еды насыпали, но чуть просыпалось");
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
