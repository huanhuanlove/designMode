package com.kang.deckerModel;

public class Vegetable extends Food {

    private Food food;

    public Vegetable(Food food) {
        this.food = food;
    }

    public String make() {
        return food.make()+"+蔬菜";
    }
}
