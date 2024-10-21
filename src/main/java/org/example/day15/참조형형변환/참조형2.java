package org.example.day15.참조형형변환;



public class 참조형2 {
    public static void main(String[] args) {
      Car car = new Car();
      Truck truck = new Truck();
      사람 person = new 사람();

      car = truck;
      //truck = car;
      //person = car;

    }
}
