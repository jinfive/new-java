package org.example.day12.상속;

public class 원더우먼 extends 우먼 {
    int high;


    public 원더우먼(char gender, String name,int high) {
        super(gender, name);
        this.high = high;
    }

    @Override
    public String toString() {
        return "원더우먼{" +
                "high=" + high +
                ", walk=" + walk +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }
}
