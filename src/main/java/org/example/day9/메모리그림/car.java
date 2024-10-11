package org.example.day9.메모리그림;

public class car {
    //필드2 --> 맴버변수 ,전역변수(자동초기화)
    int size;
    int speed;
    //메서드2 -->맴버 메서드
    public String print(){
        return "사이즈"+size + " " + "속도"+speed;
    }//프린트 메서드

    public void hi(){
        //메서드 정의 -->실행되지 않음. 호출시 실행!
        int temp = 10;//지역변수 초기화(), 기본형
        System.out.println("속도를 높이다."+temp);
        System.out.println(print());//내 클래스에서는 함수와 변수를 마음대로 불러서 사용이 가능하다.
        //왜부에서는 참조형 변수 필요하다 new해서

    }

}
