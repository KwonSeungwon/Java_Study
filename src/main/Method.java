package main;

public class Method {

    public Method() {
        System.out.println("생성자!");
    }
    public String name;

    public String gender;

    public int age;

    public static void main(String[] args) {

        Method method = new Method();
        method.setData("권승원", "M", 29); //메소드 호출
        method.setData("test", true, 20.5);
        method.runTest(); //메소드 호출

    }
    /* 메소드명은 카멜표기식을 주로사용 + (동사 + 목적어or명사로 메소드명을 정함)
     * 메소드 구성 : (접근제어자)(반환형)(메소드명)(매개변수)
     * 매개변수(parameter) : 메서드에 전달하는 지역변수
     * 접근제어자 : pbulic(어디서나 접근가능), private(외부에서 호출이 불가능, 해당클래스에서만 호출가능),
     * protected(동일 패키지, 클래스, 상속받은 외부패키지, 클래스에서만 호출가능), default(해당 패키지 내에서만 호출(접근) 가능)
     */
    public void runTest() { // 메서드 선언부
        //메서드 정의부
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
    }

    public void setData(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //중복메서드(overloading) : 똑같은 이름을 가진 메소드(※ 매개변수에 차이가있어야함)
    public void setData(String name, boolean isMan, double age) {
    }
}
