package org.example.day12.상속;

public class 맨 extends 사람 {
    int power ;

    public 맨(char gender, String name,int power) {
        //super()항상 맨 첫줄
        super(gender, name);
        this.power = power;

    }


    public void run(){
        System.out.println("사람이 달립니다.");
    }
}
