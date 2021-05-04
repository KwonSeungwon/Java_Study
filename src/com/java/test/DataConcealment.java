package com.java.test;

public class DataConcealment { //데이터 은닉 예제

    private String name; // private 접근제어자를 이용해 외부에서 멤버변수(속성)에 접근할 수 없게함.

    private int age;

    public DataConcealment(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
