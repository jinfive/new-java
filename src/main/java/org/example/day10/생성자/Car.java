package org.example.day10.생성자;

public class Car {
    //필드,맴버 변수
    String model;
    String color;
    int maxSpeed;

    //맴버 메서드
    public void speedup() {
        System.out.println("속도를 높이다");
    }//speedup함수

    /*
    public Car(){
        컴파일시 내용도 없고 파라메터도 없는 생성자 자동생성
        묵시적 생성
        맴버메서드
        파라메터도 없고 내용도 없습니다.
        내용도 없는 메서드 생성
        프로그래머가 하나도 생성자 를 만들어 주지 않은 경우에만 자동 생성
        파라메터없는 생성자 메서드 ==> 기본 생성자
        묵시적 생성자는 내용이 없어요(객체 실행시 실행되는것이 없음
        객체 생성시 무엇인가 실행되는 것을 넣고 싶은 경우 (알림 서비스
        맹시적 생성자는 개게생성시 무엇인가 실행되는것을 알고 싶은경우

    }

     */
    public Car() {
        {
            System.out.println("객체 생성 완료");
        }
    }
}
