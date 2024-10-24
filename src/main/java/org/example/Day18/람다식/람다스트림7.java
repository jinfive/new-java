package org.example.Day18.람다식;

import java.util.Arrays;
import java.util.List;

public class 람다스트림7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","cherry","date","fig");

        words.stream()
                .map(word -> word.contains("a"))
                .forEach(System.out::println);
    }
}
