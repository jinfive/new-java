package org.example.Day19.디자인패턴;

public class 싱글톤겍체생성2 {
    public static void main(String[] args) {
        //new 싱글톤클래스(); 외부에서 객체 생성 불가
        //싱글톤 객체는 싱글톤클래스 내부에서 하나만 만들게 한다.
        //외부에서는 하나만 만들어 놓은 싱글톤 객체의 주소를 가져와서 사용함.
        //외부에서는 하나가 만들어졌는지 모름.statoc로 호출해서 확인!
        싱글톤클래스 one = 싱글톤클래스.getInstance();
        싱글톤클래스 two = 싱글톤클래스.getInstance();
        System.out.println(one);
        System.out.println(two);
    }
}
