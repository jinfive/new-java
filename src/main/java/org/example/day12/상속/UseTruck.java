package org.example.day12.상속;

public class UseTruck {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.color ="파랑";
        truck.speed = 60;
        truck.weight = 1;
        System.out.println(truck);
        truck.start();
        truck.move();
        truck.end();
    }
}
