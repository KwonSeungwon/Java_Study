package com.java.test;

public class Child extends Parent { // parent class를 상속


    public Child() {
        System.out.println("child class!");
    }

    public void childMethod() {
        System.out.println("child method!");
    }

    @Override
    public void parentAgoMethod() {
        System.out.println("parent class method override!");
        System.out.println("call super value" + super.attribute); // 상위클래스(부모클래스)의 속성을 super키워드로 호출
    }
}
