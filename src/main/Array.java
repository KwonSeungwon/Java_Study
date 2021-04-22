package main;

import java.io.*;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) throws IOException {
        //배열 : 인덱스를 이용해 자료형이 같은 데이터를 관리하는 자료형
        int[] arr1 = new int[5]; // 선언
        arr1[0] = 1; //값 할당
        arr1[1] = 2;
        arr1[2] = 3;
        int[] arr2 = {10, 20 , 30}; //선언과 초기화
        //중요! Java의 배열은 한 번 크기가 정해지면 그 이후에는 크기변경이 불가능함
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("입력하세요");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] stringArray = new String[3];
        stringArray[0] = reader.readLine();
        stringArray[1] = reader.readLine();
        stringArray[2] = reader.readLine();
        writer.write(stringArray[0] + "/");
        writer.write(stringArray[1] + "/");
        writer.write(stringArray[2] + "/");

        Scanner sc = new Scanner(System.in);
        String[] stringArray2 = new String[3];
        System.out.println("스캐너입력");
        stringArray2[0] = sc.next();
        stringArray2[1] = sc.next();
        stringArray2[2] = sc.next();
        System.out.println("스캐너 입력 값 : " + stringArray2[0] + "/" + stringArray2[1] + "/" + stringArray2[2]);

        reader.close();
        writer.close();
        sc.close();

    }
}
