package org.example.Day19.스트림심화;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamPractice3 {
    public static void main(String[] args) {
        System.out.println(  IntStream.rangeClosed(1500, 3500).average().getAsDouble());
        
    }
}
