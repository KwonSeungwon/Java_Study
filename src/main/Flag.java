package main;

import java.io.*;

public class Flag {
    public static void main(String[] args) throws IOException {
        //조건문 : 조건의 결과에 따라서 양자 택일 또는 다자 택일을 진행하는 것
        int num1 = 10;
        int num2 = 20;
        if(num1 < num2) {
            System.out.println("num1은 num2보다 작다");
        }
        if(num1 < num2) {
            System.out.println("num1은 num2보다 작다");
        } else {
            System.out.println("num1은 num2보다 크거나 같다");
        }
        if(num1 < num2) {
            System.out.println("num1은 num2보다 작다");
        } else if(num1 > num2){
            System.out.println("num1은 num2보다 크다");
        } else {
            System.out.println("num1은 num2과 같다");
        }

        //switch문 비교대상이 되는 결과값이 많은 경우 주로 사용

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int score = reader.read();
        switch (score) {
            case 100 :
                writer.write("A등급:" + score);
                break;
            case 90 :
                writer.write("B등급 : " + score);
                break;
            case 80 :
                writer.write("C등급 : " + score);
                break;
            default :
                writer.write("낙제점 : " + score);
                break;
        }
        writer.flush();
        reader.close();
        writer.close();
    }
}
