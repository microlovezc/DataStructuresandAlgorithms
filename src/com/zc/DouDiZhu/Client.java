package com.zc.DouDiZhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        //准备牌面
        ArrayList<String> poker = new ArrayList<>();

        String[] color = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");
        for (String s : color) {
            for (String number : numbers) {
                poker.add(s+number);
            }
        }
        for (String s : poker) {
            System.out.println(s);
        }
        //洗牌
        Collections.shuffle(poker);

        //发牌
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> bottom = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String s = poker.get(i);
            if (i>=51){
                bottom.add(s);
            }
            if ( i%3 == 0 ){
                p1.add(s);
            }else if ( i%3 == 1){
                p2.add(s);
            }else {
                p3.add(s);
            }
        }

        System.out.println("player1:"+p1);
        System.out.println("player2:"+p2);
        System.out.println("player3:"+p3);
        System.out.println("底牌"+bottom);

    }

}
