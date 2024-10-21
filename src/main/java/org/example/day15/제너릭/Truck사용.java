package org.example.day15.제너릭;

public class Truck사용 {
    public static void main(String[] args) {
        Truck<String,Integer> truck1 = new Truck<>();
        truck1.weight = "에잇톤트럭";
        truck1.street = 100;

        Truck<Double,String> truck2 = new Truck<>();
        truck2.weight =8000.01;
        truck2.street = "장거리 전용";

        System.out.println(truck1);
        System.out.println(truck2);
    }
}
