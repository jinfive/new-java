package org.example.Day18.람다식;

import java.util.Arrays;
import java.util.List;

public class 람다스트림6 {
    public static void main(String[] args) {
        //배열에 있는 data를 바로 arraylist에 넣어보자
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        list.stream()
                .map(i -> i * i )
                .forEach(System.out::println);
    }
}
