package org.example.Day18.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q7 {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("사과", "바나나", "포도", "바나나", "멜론");

        Arrays.stream(numbers.toArray())
                .distinct()
                .forEach(System.out::println);
        List<String> strings = Arrays.asList("apple", "good", "grape", "ice", "melon");
        strings.stream()
                .filter(string -> string.length() >= 5)
                .forEach(System.out::println);


    }

}

