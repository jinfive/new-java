package org.example.Day19.스트림심화;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class 랜덤스트림 {
    public static void main(String[] args) {
        System.out.println(  IntStream.rangeClosed(1, 100).sum());
        System.out.println(  IntStream.range(1, 100).sum());

        Random r = new Random();
        int result = r.ints(100,1,100).distinct().sum();
        System.out.println(result);

//        r.ints(100,1,100)
//                .sorted()
//                .forEach(System.out::println);
        DoubleStream ds = r.doubles(2000,0,100);
        long count = ds.distinct().count();
        System.out.println("중복 제거한후 개수>>>"+count);
         r.doubles(200,0,0  ) .distinct().sorted().forEach(System.out::println);


    }
}
