package com.java.test;

public abstract class AbstractClass { // 추상클래스

    // 멤버변수를 가질 수 있음
    int age;

    String name;

    public AbstractClass(int age, String name) { // 생성자도 가질 수 있음
        this.age = age;
        this.name = name;
    }

    public String methodOne() { // 일반메소드도 가질 수 있음
        return "일반메소드";
    }

    public abstract void abstractMethod(); // 구현을 강제하는 추상메서드를 만들 수 있음
}
