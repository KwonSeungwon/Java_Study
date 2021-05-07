package com.java.test;

public class NestingClass { // 외부 클래스

    private int a;

    private String b;

    static class innerClass { // 이너 클래스
        int innerA;

        public innerClass() {
            System.out.println("inner class!");
        }
    }

    static class staticInnerClass { // 정적 이너클래스

        public staticInnerClass() {
            System.out.println("static inner class!");
        }
    }
}
