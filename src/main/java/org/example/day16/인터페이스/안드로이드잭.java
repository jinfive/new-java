package org.example.day16.인터페이스;

public class 안드로이드잭 implements 아이폰잭{

    @Override
    public void 납작하게만들다() {
        System.out.println("검정색으로 납작하게");
    }

    @Override
    public void 이센치로만들다() {
        System.out.println("케이블은 2cm보다 길어도 상관없다."); // 완전 메서드 > 일반 메서드
    }

    //표준 역할을 하는 인터페이스가 있는경우 인터페이쓰를 꼭 써야만 하나?
    //써야하는 이유>>

}
