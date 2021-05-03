package com.java.main;

import java.io.*;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) throws IOException {
        //반복문 : 조건이 거짓일 떄까지 순회하는 명령문
        //BufferedReader는 read사용시 제일 첫 번째에 걸리는 값을 유니코드로 읽음
        //for문
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i = 0; i < count; i++) {
            System.out.println("i * count = " + i * count);
        }
        sc.close();
        reader.close();
        writer.close();

        //while문 : 조건이 거짓일 떄 까지 실행
        int i = 0;
        while (i < 10) {
            System.out.println("i + i = " + i + i);
            i++;
        }

        //do - while문 : while문과 비슷하며, 차이점은 조건 결과에 상관없이 무조건 최초 한번은 괄호안의 내용을 실행한다.
        do {
            System.out.println("최초 1번은 실행해요");
        } while(false); // 이후 while문 안의 조건이 거짓이면 1번만 실행하고 이후에 실행하지 않음
    }
}
