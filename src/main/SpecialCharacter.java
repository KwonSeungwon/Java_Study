package main;

public class SpecialCharacter {
    public static void main(String[] args) {
        /*
         * [특수한 목적으로 사용되는 문자]
         * \t - 탭
         * \n - 줄바꿈(개행)
         * \' - 작은따옴표
         * \" - 큰 따옴표
         * \\ 역슬래시
         */
        System.out.println("탭\t" + "줄바꿈\n" + "작은따옴표\'" + "큰따옴표\"" + "역슬래시\\");
        /*
         * [서식문자] - printf를 이용해 출력(print + format)
         * %d - 10진수 + 예시) %5d로 하면 오른쪽정렬로 출력하고 빈 공간은 공백으로 자동채워짐
         * %o - 8진수
         * %x - 16진수
         * %c - 문자(character)
         * %s - 문자열(String)
         * %f - 실수(float) + 정렬기능은 뒤에 .(숫자)를 해주면 숫자만큼 내림으로 표기됨
         */
        System.out.printf("10진수%d\t", 10);
        System.out.printf("8진수%d\t", 10);
        System.out.printf("16진수%d\t", 10);
        System.out.printf("문자\t", 'a');
        System.out.printf("문자열\t", "hello");
        System.out.printf("실수%f", 3.14);
    }
}
