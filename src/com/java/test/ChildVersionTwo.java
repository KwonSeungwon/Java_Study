package com.java.test;

public class ChildVersionTwo extends Parent{

    public ChildVersionTwo() {
    }

    @Override
    public void parentAgoMethod() {
        System.out.println("child version 2 override!");
    }
}
