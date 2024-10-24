package org.example.Day18.람다식;

public class LambdaExample {
    public static void main(String[] args) {
        LambdaEx le = (str) -> str.toUpperCase();
        System.out.println(le.convert("Hello, Lambda!"));
    }
}
