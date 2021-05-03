package com.java.main;

public class Variable {
    public static void main(String[] args) {
        //변수 : 데이터(자료)를 임시로 담을 수 있는 상자(메모리 공간)
        // int i <- 선언부 = (대입연산자) 10(초기화) ;(마무리 세미콜론)
        int i = 10;
        int j;
        j = 100;
        System.out.println("i + j =" +  (i + j));
        // ibit = 8byte , int자료형은 4byte
        int num = 100;
        System.out.println(num);
        num = 110;
        System.out.println(num);
        num = 200;
        System.out.println(num);
        num = 300;
        System.out.println(num);
        // ※ 변수의 사용이유 : 재활용을 위해서

        /*
          기본 자료형은 데이터가 변수에 직접 저장되고, 객체 자료형은 객체 메모리 주소에 변수가 저장됨
          C계열에서는 포인터, Java에서는 래퍼런스(참조)
          기본자료형 : 정수, 실수, 문자, 불리언(true, false)
          객체 자료형의 경우 주소값만을 저장하기때문에 4byte로 고정되어있음
          1bit = 8byte
         */
        //정수형
        byte a = 1; // 1byte
        char b = '2'; // 2byte
        short c = 3; //2byte
        int d = 4; // 4byte
        long e = 5; // 8byte
        //실수형
        float f = 6.333f; //4byte float형으로 쓰려면 뒤에 f를 붙여야함
        double g = 7.55555; // 8byte
        //논리형
        boolean h = true; //1byte 0 = false, 1 = true
        //객체자료형
        String ii = "hi"; // 4byte(주소값)
        System.out.println("int : " + d + " double : " + g + " boolean : " + h + " String : " + ii);
        //자동(묵시적) 형 변환 : 작은공의 메모리에서 큰 공간의 메모리로 변경되는 것
        //명시적 형 변환 : 큰 공간의 메모리에서 작은 공간의 메모리로 변경되는 것 -> 데이터 유실의 위험이 존재함
    }
}
