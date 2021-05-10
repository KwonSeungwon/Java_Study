package com.java.abstractBank;

public class Mybank extends Bank {

    public Mybank(String name, String account, int totalAmount) {
        super(name, account, totalAmount); // 상속받은 상위클래스의 멤버변수에 받아진 변수를 할당
    }

    @Override
    public void installmentSavings() {
        System.out.println("적금메소드");
    }

    @Override
    public void cancellation() {
        System.out.println("해약메소드");
    }

    public void getInfos() {
        System.out.println("이름 : " + this.name + "\n계좌 : " + this.account + "\n총액 : " + this.totalAmount);
    }
}
