package com.java.main;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStreamWriter;

public class StringClass { // 문자열 클래스
    public static void main(String[] args) {
        // String 클래스는 데이터가 변화하면 메모리상의 변화가 많아 속도가 저하된다.
        // 예) ABC라는 문자열에 DEF라는 문자열을 추가하면 새로운 객체를 생성하기(기존 객체 복사 + 생성) 때문에 속도저하가 된다. * String class는 객체취급이기때문

        //StringBuffer, StringBuilder -> 스트링 버퍼와 빌더는 데이터가 변경되면 메모리에 존재하는 기존 객체를 이용한다.
        StringBuffer sf = new StringBuffer("ABC");
        sf.append("2222"); // 기촌 sf객체에 2222를 추가
        StringBuilder sb = new StringBuilder("2222"); // 속도 : StringBulider, 안정성 : StringBuffer(싱크로나이즈 기법(정렬 후 읽음), synchronized(동시성제어))
        sb.append("22222");
        sb.insert(1, "------"); // 특정위치에 insert
        sb.delete(1,2); // 1에서 2길이 까지삭제
        System.out.println(sb);
    }
}
