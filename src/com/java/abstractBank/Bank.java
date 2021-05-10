package com.java.abstractBank;

public abstract class Bank {

    String name;

    String account;

    int totalAmount;

    public Bank() {
        System.out.println("bank class");
    }

    public Bank(String name, String account, int totalAmount) {
        this.name = name;
        this.account = account;
        this.totalAmount = totalAmount;
    }

    public void deposit() { // 예금
        System.out.println("예금");
    }

    public void withDraw() {
        System.out.println("출금");
    }

    public abstract void installmentSavings(); // 적금

    public abstract void cancellation(); // 해약


}
