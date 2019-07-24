package com.kang.viewModel;

import java.util.ArrayList;
import java.util.List;

//被观察者
public class XiaoMei {

    List<Person> list = new ArrayList<Person>();

    public XiaoMei(){
    }

    public void addPerson(Person person){
        list.add(person);
    }

    //遍历list，把自己的通知发送给所有观察自己的人
    public void notifyPerson() {
        for(Person person:list){
            person.getMessage("今天家里就我一个人，等你们!");
        }
    }
}
