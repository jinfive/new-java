package org.example.Day18.람다식;

import java.util.Arrays;
import java.util.List;

public class 람다스트림3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi","hello","world","mom","by");

        words.stream()
                .filter(word -> word.length() >= 3)
                .forEach(System.out::println);
    }
}
