package com.java.main;
import com.java.test.StaticTest;
import com.java.test.DataConcealment;
public class MainClass {
    public static void main(String[] args) {

        StaticTest staticTest = new StaticTest("테스터1");
        staticTest.saveMoney(100);

        StaticTest staticTest2 = new StaticTest("테스터2");
        staticTest.saveMoney(300);

        staticTest.getBankInfo();
        staticTest2.spendMoney(400);
        staticTest.getBankInfo();


        DataConcealment dataConcealment = new DataConcealment("권승원", 29); // getter, setter 예제
        dataConcealment.setAge(28);
        dataConcealment.setName("클론권");
        dataConcealment.getInfo();

    }
}
