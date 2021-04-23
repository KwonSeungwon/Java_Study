package main;

import java.io.*;
import java.util.Arrays;
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


        /*
         * 배열의 메모리 구성 : 배열을 구성하는 데이터의 자료형에 따라서 배열의 메모리 크기가 결정된다.
         * 예) int[] arr = new int[3] => int형 자료하나가 4바이트 * 3 = 배열은 12바이트가 됨.
         * 기본 자료형 데이터를 담고 있는 변수와는 다르게 배열은 데이터의 주소를 가지고 있다(String 처럼)
         * 배열 요소복사는 값만 복사하는 것임(주소 복사 x)
         * 배열을 다른 배열에 대입을하면 주소가 복사되는 것임(배열1 = 배열2) => 배열1은 배열2의 주소를 가짐 즉 같은 곳을 바라봄
         */

        System.out.println("배열 길이 : " + stringArray.length + " 배열 요소 출력 : " + stringArray.toString() + "배열 요소 복사 : + newArray = Arrays.copyOf(복사하려는 배열, 복사하려는 배열길이)" );
        System.out.println("배열의 주소 : " + arr1);

        /*
         * 다차원배열 행렬과 비슷하다고 생각하면 됨.
         * int[][] arr = new int[3][2]; => 4x4의 공간을 가진 2차원배열(행,열) 2차원까지만 주로사용
         * (이런느낌)
         * 1 1
         * 1 1
         * 1 1
         */
        int[][] arrV2 = new int[2][2];
        arrV2[0][0] = 3; // => 1행 1열에 3을 대입



    }
}
