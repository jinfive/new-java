package org.example.day12.상속;

public class 슈퍼맨 extends 맨{
    public 슈퍼맨(char gender, String name, int power) {
        super(gender, name, power);
    }

    public void fly(){
        System.out.println("슈퍼맨이 날아다닙니다.");
    }//fly

    @Override
    public String toString() {
        return "슈퍼맨{" +
                "power=" + power +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }
}//class
