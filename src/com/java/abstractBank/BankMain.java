package com.java.abstractBank;

public class BankMain {
    public static void main(String[] args) {
        Bank mybank = new Mybank("권승원", "1111-5555-55555", 30); // 부모클래스로 선언해도 자식클래스를 사용가능(상속받았기 때문)
        mybank.deposit();
        mybank.withDraw();
        mybank.installmentSavings();
        mybank.cancellation();
        ((Mybank) mybank).getInfos();

    }
}
