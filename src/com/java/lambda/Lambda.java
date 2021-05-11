package com.java.lambda;

public class Lambda {
    public static void main(String[] args) {
        // LambdaInterface를 클래스가 상속받지 않고 람다식을 이용하여 재정의 및 사용
        LambdaInterface l1 = (String a, String b, String c) -> { // 1. LambdaInterface를 li에 할당 2. LambdaInterface의 추상메서드를 람다식을 이용하여 재정의
            System.out.println(a + "---" + b + "----" + c);

        };
        l1.testMethod("1", "2", "3");

        /*
         * 람다식은 중괄호 마무리에 세미콜론을 찍어야함
         * 1. 매개변수가 1개이너가 타입이 같은경우 타입을 생략할 수 있다 => (s1) -> {System.out.println()}
         * 2. 실행하는 로직이 1개인경우 중괄호 생략가능 => (s1) -> System.out.println()
         * 3. 매개변수 & 실행하는 로직이 1개인경우 모든괄호 생략가능 => s1 -> System.out.println()
         * 4. 매개변수가 없는경우 그냥 ()만 입력한다. => () -> System.out.println()
         * 5. 반환값이 있는경우 return을 사용한다. => (a, b) ->{ int result = a * b; return result;};
         */
    }


}
