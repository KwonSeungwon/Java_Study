package com.java.test;

public class Robot implements Toy {
    @Override
    public void run() {
        System.out.println("로봇은 달릴 수 있음");
    }

    @Override
    public void walk() {
        System.out.println("로봇은 걸을 수 있음");
    }

    @Override
    public boolean fly() {
        System.out.println("로봇은 걸을 수 없음");
        return false;
    }

    @Override
    public void fight() {
        System.out.println("로봇은 싸울수 수 있음");
    }
}
