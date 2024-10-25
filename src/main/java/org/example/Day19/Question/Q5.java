package org.example.Day19.Question;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Q5 {
    public static void main(String[] args) {
        /*
        List<Double> list = Arrays.asList(11.1, 22.2, 33.3, 44.4, 55.5);를 스트림으로 만들어
   최대값, 최소값, 합계, 평균을 구하시오.
         */
        List<Double> list = Arrays.asList(11.1, 22.2, 33.3, 44.4, 55.5);
        System.out.println(list.stream().mapToDouble(Double::doubleValue).max().getAsDouble());
        System.out.println(list.stream().mapToDouble(Double::doubleValue).min().getAsDouble());
        System.out.println(list.stream().mapToDouble(Double::doubleValue).sum());
        System.out.println(list.stream().mapToDouble(Double::doubleValue).average().getAsDouble());

    }
}
