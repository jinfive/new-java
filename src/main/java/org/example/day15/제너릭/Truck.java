package org.example.day15.제너릭;

public class Truck<T1,T2> {
    //객체 생성시 타입을 내 맘대로 지정
    //클래스 생성시,타입을 지정 안함
    //특정하게 타입을 지정 하지 않음.
    T1 weight;
    T2 street;

    @Override
    public String toString() {
        return "Truck{" +
                "street=" + street +
                ", weight=" + weight +
                '}';
    }//toString

}
