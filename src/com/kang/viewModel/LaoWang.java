package com.kang.viewModel;

//观察者
public class LaoWang implements Person {

    private String name = "老王";

    public LaoWang() {
    }

    @Override
    public void getMessage(String s) {
        System.out.println(name + "接到电话，内容是：" + s);
    }
}
