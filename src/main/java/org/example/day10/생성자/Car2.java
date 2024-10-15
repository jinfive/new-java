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

    public Car2(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public Car2(String model) {
        this.model = model;
    }

    //재정의(기존에 있던 메서드를 내 마음대로 수정해서 쓰고 싶을때
    //기존에 있던 것 그래도 다시 쓴다.
    //car2 car2 =new car2()
    //System.out.println(car2); >>>>>>org.example.day10.생성자.Car2@15db9742
    //패키지명.클래스이름@주소 출력
    //car2를 프린트 하라고 하면 프린트 하기 전에 내부적으로 toString()함수를 통해
    //위에 있는 스트링으로 미리 만들어,그것을 프린트 하게 되어있음.
    //주소가 가르키고 있는 힙영역의 객체의 필드값을 toString()으로 만들어서
    //그 값을 프린트 하는것이 더 유용!
//    public String toString() {
//        return "생선된 객체의 힙 영역 데이터" + model + " " + color + " " + maxSpeed;
//    }

    @Override
    public String toString() {
        return "Car2{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

}
