package org.example.Day18.Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello","Hi","smile");

        List<String> result = words.stream()
                .filter(s -> s.length()>4)
                .collect(Collectors.toList());
        System.out.println(result);

        List<String> result2 = words.stream()
                .map(s -> s + "님")
                .collect(Collectors.toList());
        System.out.println(result2);
    }
}
