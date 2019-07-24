package com.kang.deckerModel;

/************************************************************************************/
/******************************       装饰者模式     ********************************/
/************************************************************************************/
public class Food {
    /**
     * 对已有的业务逻辑进一步的封装，使其增加额外的功能
     */

    private String foodName;

    public Food() {
    }

    public Food(String foodName) {
        this.foodName = foodName;
    }

    public String make() {
        return foodName;
    };
}
