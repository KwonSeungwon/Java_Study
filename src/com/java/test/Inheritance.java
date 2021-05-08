package com.java.test;
import com.java.main.TestInterface;
import com.java.main.TestInterfaceTwo;
import com.java.main.interfaceMain;

import java.util.ArrayList;


public class Inheritance { // 인터페이스 상속
    public static void main(String[] args) {

        Child child = new Child(); // 자식클래스 생성, 초기화화
        child.parentMethod(); // 부모 메소드 호출(상속 받은)
        child.childMethod(); // 자식 메소드 호출
        child.parentAgoMethod(); // override된 메소드


        Parent[] arrParents = new Parent[2];
        Parent ch1 = new Child(); // 부모클래스를 자료형으로 지정해도 상관없음
        Parent ch2 = new ChildVersionTwo();
        arrParents[0] = ch1;
        arrParents[1] = ch2;

        NestingClass.innerClass innerClass = new NestingClass.innerClass(); // 이너 클래스생성
        NestingClass.staticInnerClass staticInnerClass = new NestingClass.staticInnerClass(); // 정적(클래스) 생성

        new AnonymousClass() { // 익명클래스 생성 및 초기화(변수에 값을 담지 않기 때문에 재사용이 불가능)

            @Override
            public void method() {
                System.out.println("익명 클래스 메소드 오버라이딩");
            }
        }.method();

        TestInterface int1 = new interfaceMain();
        TestInterfaceTwo int2 = new interfaceMain();
        int1.methodOne();
        int2.methodTwo();

        // 각각 비행기, 장난감 클래스지만 toy라는 자료형을 똑같이 상속받기 떄문에 toy라는 자료형으로 묶을 수 있음
        Toy airplane = new Airplane();
        Toy robot = new Robot();
        ArrayList<Toy> toys = new ArrayList<>();
        toys.add(airplane);
        toys.add(robot);
        System.out.println(toys.get(0).fly());
        System.out.println(toys.get(1).fly());


    }
}
