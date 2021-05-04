package com.java.test; // 패키지 import
import com.java.main.Flag; // 타 패키지의 클래스 import

public class StaticTest {

    String name;

    static int amount;

    public StaticTest(String name) {
        this.name = name;
    }

    public void saveMoney(int money) {
        amount += money;
        System.out.println("amount:" + amount);
    }

    public void spendMoney(int money) {
        amount -= money;
        System.out.println("amount:" + amount);
    }

    public void getBankInfo() {
        System.out.println("name" + name);
        System.out.println("amount" + amount);
    }


}


