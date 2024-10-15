package org.example.day10.생성자;

import java.awt.*;

public class UseCar {
    public static void main(String[] args) {
        Car2 car2 = new Car2("테슬라","검정색",180);

        System.out.println(car2.model + " " +car2.color + " " +car2.maxSpeed);
        System.out.println(car2);

        Car2 car3= new Car2("bmw ","하얀색",240);


        System.out.println(car3.model + " " +car3.color + " " +car3.maxSpeed);
        System.out.println(car3);
        car3.speedup();


    }


}
