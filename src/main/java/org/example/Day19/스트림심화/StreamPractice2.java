package org.example.Day19.스트림심화;

import java.util.Arrays;
import java.util.List;

public class StreamPractice2 {
    public static void main(String[] args) {
        double[] list2 = {11.1, 22.2, 33.3, 44.4};
        double sum = Arrays.stream(list2).map(x -> x + 10).sum();
        System.out.println(sum); //151.0

        
    }
}
