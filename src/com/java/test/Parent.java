package com.java.test;

public class Parent {


    public int attribute;

    public Parent() {
        System.out.println("parent class!");
    }

    public void parentMethod() {
        System.out.println("parent method!");
    }

    private void secretMethod() {

    }

    public void parentAgoMethod() {
        System.out.println("이전메소드!");
    }

}
