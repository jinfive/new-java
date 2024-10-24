package org.example.Day18.람다식;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 람다스트림5 {
    public static void main(String[] args) {
    List<String> list =Arrays.asList("apple","banana","cherry","date");
            list.stream()
                    .map(str -> str.substring(0,1))
                    .forEach(System.out::println);
    }
}
