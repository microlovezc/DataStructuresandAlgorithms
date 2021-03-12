package com.zc.demo.demo01;

import java.util.ArrayList;

public class Manager extends User{

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney , int count){

        ArrayList<Integer> moneyList=new ArrayList<>();

       int leftMoney=super.getMoney();

       if (leftMoney<totalMoney){
           System.out.println("余额不足！");
           return moneyList;
       }

       super.setMoney(leftMoney-totalMoney);

       int avgMoney = totalMoney / count;
       int lMoney = totalMoney % count;

        for (int i = 0; i < count-1; i++) {
            moneyList.add(avgMoney);
        }

        moneyList.add(avgMoney + lMoney);

        return moneyList;
    }

}
