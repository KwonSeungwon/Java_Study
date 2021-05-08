package com.java.main;

public class interfaceMain implements TestInterface, TestInterfaceTwo{
    @Override
    public void methodOne() {
        System.out.println("메소드1!");
    }

    @Override
    public void methodTwo() {
        System.out.println("메소드2!");
    }
}
