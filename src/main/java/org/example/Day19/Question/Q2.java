package org.example.Day19.Question;

import java.io.IOException;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.DoubleStream;

public class Q2 {
    /*
    실수값 200개를 11.1~55.5까지 랜덤하게 스트림을 만들어서
    전체 개수, 맨 앞에 있는 값, 평균을 구하시오.
     */
    public static void main(String[] args) {
        Random r = new Random();
        DoubleStream d = r.doubles(200,11.1,55.5);
        DoubleStream d2 = r.doubles(200,11.1,55.5);
        DoubleStream d3= r.doubles(200,11.1,55.5);
        long count =d
                .count();
        OptionalDouble first =d2.findFirst();
        OptionalDouble avg =d3.average();

        System.out.println("전채 개수>>>"+count);
        System.out.println("첫번째 수>>>"+first. getAsDouble());
        System.out.println("평균>>>"+avg.getAsDouble());
    }
}
