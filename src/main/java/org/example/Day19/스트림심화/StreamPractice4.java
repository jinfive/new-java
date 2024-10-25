package org.example.Day19.스트림심화;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamPractice4 {
    public static void main(String[] args) {
        Random r = new Random();
         r.ints(100,3500,4000)
                .sorted()
                .distinct()
                .forEach(System.out::println);

    }
}
