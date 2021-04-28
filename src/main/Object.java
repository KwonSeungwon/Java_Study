package main;

//클래스는 멤버변수(속성), 메서드(기능), 생성자 등으로 구성
public class Object { // <- 클래스 : 일반적으로 클래스명은 첫 글자는 대문자로 쓴다

    //멤버변수(속성)
    public String name;

    public String color;

    public int price;

    public Object() { // 생성자 : 외부에서 호출했을 때 가장먼저 실행되는 부분(생성시 필요한 기능을 메서드 안에 서술함) / 객체를 초기화는 서브루틴
        System.out.println("Constructor(생성자) / default(기본) 생성자");
    }

    public Object(String name, String color) { // 생성자는 여러 개가 될 수 있다.
        System.out.println("Constructor(생성자) / 파라미터가 있는 생성자");
        name = name; //호출부에서 값을 매핑
        color = color; //호출부에서 값을 매핑
    }

    public void run() { //메서드(기능)
        System.out.println("달리기 기능");
    }

    //반환값이 없는 메소드
    public void stop() {
        System.out.println("멈추기 기능");
    }

    public void info() {
        System.out.println("name : "  + name);
        System.out.println("color : "  + color);
        System.out.println("price : "  + price);
    }

    //접근제어자(public) 뒤에 반환 값이 있는 경우 데이터타입을 서술해서 반환형 메소드를 만들 수 있다
    public String str() {

        return "";
    }
}


