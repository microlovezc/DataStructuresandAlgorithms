package com.zc.demo.demo01;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",200);
        Member member1 = new Member("群员1",0);
        Member member2 = new Member("群员2",0);
        Member member3 = new Member("群员3",0);

        manager.show();
        member1.show();
        member2.show();
        member3.show();
        System.out.println("=============================");

        ArrayList<Integer> send = manager.send(50, 3);
        member1.receive(send);
        member2.receive(send);
        member3.receive(send);

        manager.show();
        member1.show();
        member2.show();
        member3.show();
        System.out.println("=============================");

        ArrayList<Integer> send2 = manager.send(60, 3);
        member1.receive(send2);
        member2.receive(send2);
        member3.receive(send2);

        manager.show();
        member1.show();
        member2.show();
        member3.show();

    }
}
