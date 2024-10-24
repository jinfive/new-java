package org.example.Day18.람다식;

public class LambdaExample2 {
    public static void main(String[] args) {
        LambdaEx2 le = (s) -> s.length();
        System.out.println(le.getLength("Hello, Lambda!"));
    }
}
