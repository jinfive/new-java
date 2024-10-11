package org.example.day9.메모리그림;

public class car사용 {
    public static void main(String[] args) {
        car car1 = new car(); //car1은 class의 인스턴스,객체(오브젝트)
        //car(를,class)--new -->객체 생성
        //new로 객체를 생성한 경우 맴버변수가 힙영역에 만들어진다.
        //new를 하면 힙영역에 만들어진다.
        car1.size = 10;
        car1.speed = 20;

        //클래스 인스턴스 car1 :참조형 변수
        //주소(힙영역) --> 필드 접근. 메서드 호출 가능!


        car1.hi();
        int age = 7;
        System.out.println("내 차나이는" + age);
    }
}
