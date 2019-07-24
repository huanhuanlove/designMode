package com.kang.deckerModel;

public class Cream extends Food {

    private Food food;

    public Cream(Food food) {
        this.food = food;
    }

    public String make() {
        return food.make()+"+奶油";
    }
}
