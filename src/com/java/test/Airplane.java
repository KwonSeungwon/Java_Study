package com.java.test;

public class Airplane implements Toy{
    @Override
    public void run() {
        System.out.println("비행기는 못달림");
    }

    @Override
    public void walk() {
        System.out.println("비행기는 못걸음");
    }

    @Override
    public boolean fly() {
        System.out.println("비행기는 날수있음");
        return false;
    }

    @Override
    public void fight() {
        System.out.println("비행기는 싸울 수 없음");
    }
}
