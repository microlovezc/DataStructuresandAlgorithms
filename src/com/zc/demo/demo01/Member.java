package com.zc.demo.demo01;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        int money = super.getMoney();

        int rMoney = list.remove(new Random().nextInt(list.size()));

        super.setMoney(money+rMoney);


    }
}
