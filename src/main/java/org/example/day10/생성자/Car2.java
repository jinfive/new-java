package org.example.day10.생성자;

public class Car2 {
    //필드,맴버 변수
    String model;
    String color;
    int maxSpeed;

    //맴버 메서드
    public void speedup() {
        System.out.println("속도를 높이다");
    }//speedup함수

    public Car2() {
        {
            System.out.println("객체 생성 완료");
        }
    }
    public Car2(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;

    }
}
