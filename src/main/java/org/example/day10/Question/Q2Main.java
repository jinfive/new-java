package org.example.day10.Question;

public class Q2Main {
    public static void main(String[] args) {
        Q2 day1 = new Q2("자바공부",10,"강남");
        Q2 day2 = new Q2("여행",15,"강원도");
        Q2 day3 = new Q2("운동",11,"피트니스");

        System.out.println("전체 하는일의 시간:"+ Q2.totalHour);
        System.out.println("평균 일하는 시간:"+ Q2.totalHour/3);
        System.out.println(day1.toString());
        System.out.println(day2.toString());
        System.out.println(day3.toString());
    }
}
