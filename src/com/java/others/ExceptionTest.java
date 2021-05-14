package com.java.others;
import java.lang.*;

public class ExceptionTest { //예외 : 프로그램에 문제가 생겨 시스템 동작이 멈추는 것 , 예외처리 : 시스템 동작이 멈추게 하는 요인을 처리하는 것
    public static void main(String[] args) {
        /* Exception(예외) : 개발자가 대처 가능 문제들(null처리, 값 처리 등), Error(에러) : 개발자가 대처하기 힘든요인들(메모리 부족, JVM 문제, 하드웨어 문제등)
         * 대표적인 예외 : Checked Exception(반드시 처리해야하는 예외(파일입출력, 네트워킹등), Unchecked Exception(간단한 사칙연산, 변수선언등)
         * Exception Class : NullPointerException(값이 null인 경우), ArrayIndexOutOfBoundException(배열에 해당인덱스에 값이 존재하지 않을 떄), NumberFormatException(숫자에 문자를 넣었을 떄)
         * https://wikidocs.net/229
         */

        new ExceptionTest().exceptionTest();
    }
    public void exceptionTest() {
        try {
            int a = 0;
            int b = 0;
            int c = a / b;
        } catch (Exception e) {
            e.printStackTrace(); // 오류메세지를 콘솔창에 출력.
            String exceptionMsg = e.getMessage(); // 오류메세지를 가져온다.
            System.out.println(exceptionMsg);
        } finally { // 예외에 상관없이 반드시 실행되는 구문
            System.out.println("예외에 상관없이 반드시 실행되는 구문");
        }

    }

    public void ThrowException() throws Exception { // 예외처리를 해당메소드에서 하지않고 호출된 메소드에서 하도록함.
        //throws : 예외 발생시 예외 처리를 직접하지 않고 호출한 곳으로 넘긴다.
        throw new RuntimeException(); // Exception을 발생시키는 메소드
    }
}

