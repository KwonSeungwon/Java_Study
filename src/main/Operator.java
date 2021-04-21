package main;

public class Operator {
    public static void main(String[] args) {
        /*
         * 피연산자의 개수에 따라 단항, 이항, 삼항연산자로 구분
         * 단항 : +x, -x, !x / 이항 : x = y, x < y, x != y / 삼항 : 조건 : true ? false
         */

        // +=(더하고대입), -=(빼고대입), *=(곱하고대입), /=(나누고대입), %=(나머지대입)
        int x = 10;
        System.out.println("더하고 대입 : " + (x+=10));
        System.out.println("빼고 대입 : " + (x-=10));
        System.out.println("곱하고 대입 : " + (x*=10));
        System.out.println("나누고 대입 : " + (x/=10));
        System.out.println("나머지 대입 : " + (x%=10));

        //관계연산자 >(크거나) , <(작거나), >=(크거나 같으면), <=(작거나 같으면), ==(같으면), !=(같지 않으면) 참(true)
        System.out.println("1은 2보다 작나요" +  (1 > 2) + "1은 2보다 큰가요" + (1 < 2));
        //증감연산자
        System.out.println(++x);// 전위연산자(증가 후 출력)
        System.out.println(x++);// 후위연산자(출력 후 값 증가)
        System.out.println(--x);// 전위연산자(감소 후 출력)
        System.out.println(x--);// 후위연산자(출력 후 값 감소)

        //논리연산자 -> &&(논리곱: AND), ||(논리합: OR), !(논리부정: not)
        System.out.println(1 == 1 && 2 == 2); // 1과 1이 같고(and) 2와 2가 같으면 참
        System.out.println(1 == 1 || 1 == 2); // 1과 1이 같거나(or) 1과 2가 같으면 참
        System.out.println(1 != 2); // 1과 2가 같지않으면(not) 참

        //조건(삼항)연산자 -> 조건식 ? true : false
        System.out.println(1 > 2 ? "참(true)" : "거짓(false)");

        //비트 연산자 : 데이터를 비트 단위로 환산하여 연산을 수행하며, 다른 연산자보다 연산속도가 빠름, 이진법으로 변환해서 계산해야함
        // &(AND) : a 와 b가 모두 1(true)이면, |(OR) : a와 b중 하나라도 1(true)이면 , ^(XOR) : a와 b가 같지 않으면 1(true)
        int a = 2;
        int b = 3;
        System.out.println("x & y" + (a & b));
        System.out.println("x | y" + (x | b));
        System.out.println("x ^ y" + (x ^ b));
    }
}
