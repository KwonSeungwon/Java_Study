package com.java.test;

public class Inheritance {
    public static void main(String[] args) {

        Child child = new Child(); // 자식클래스 생성, 초기화화
        child.parentMethod(); // 부모 메소드 호출(상속 받은)
        child.childMethod(); // 자식 메소드 호출
    }
}
