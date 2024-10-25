package org.example.Day19.스트림심화;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamPractice1 {
    public static void main(String[] args) {
        List<Double> list1 = Arrays.asList(1000.0,2000.0,3000.0,4000.0,5000.0);
        list1.stream()
                .map(d -> d-1000)
                .forEach(System.out::println);


        List<Double> list2 = new ArrayList<>();
        list2.add(1000.0);
        list2.add(2000.0);
        list2.add(3000.0);
        list2.add(4000.0);
        list2.add(5000.0);
        list2.stream()
                .map(d -> d-1000)
                .forEach(System.out::println);
    }
}
