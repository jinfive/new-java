package org.example.day15.참조형형변환;


public class Truck extends Car {
    int weight; //무게
    public void move(){
        System.out.println(speed + "속도로 짐을 나르다.");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}