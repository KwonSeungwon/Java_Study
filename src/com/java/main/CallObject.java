package com.java.main;

public class CallObject {
    public static void main(String[] args) {

        // new라는 키워드를 이용하여 객체를 생성(Object 객체생성)
        Object object = new Object(); // 메모리에 Object라는 객체가 할당됨(Object 클래스를 래퍼런스(참조) 하고있다)
        object.price = 3000; //객체의 속성들을 설정
        object.name = "연습"; //객체의 속성들을 설정
        object.color = "red"; //객체의 속성들을 설정

        object.run();
        object.stop();
        object.info();

        //파라미터가 있는 생성자 사용
        Object object1 = new Object("변수", "노랑");
        object1.info();

        object1.name = "바꿀꼬야"; // 전달받은 값을 다른 값으로 변경
        object1.info();
    }
}
