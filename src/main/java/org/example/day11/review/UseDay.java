package org.example.day11.review;

public class UseDay {
    public static void main(String[] args) {
        System.out.println(Day.getAverage());

        Day day1 = new Day("공부","삼성동",8);
        Day day2 = new Day("선정릉","삼성동",2);
        Day day3 = new Day("명상","삼성동",3);

        System.out.println(day1.toString());
        System.out.println(day2.toString());
        System.out.println(day3.toString());

        System.out.println(Day.sum);
        System.out.println(Day.count);

    }//main
}//class
