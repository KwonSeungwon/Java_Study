package com.java.main;
import com.java.test.StaticTest;

public class MainClass {
    public static void main(String[] args) {

        StaticTest staticTest = new StaticTest("테스터1");
        staticTest.saveMoney(100);

        StaticTest staticTest2 = new StaticTest("테스터2");
        staticTest.saveMoney(300);

        staticTest.getBankInfo();
        staticTest2.spendMoney(400);
        staticTest.getBankInfo();
    }
}
