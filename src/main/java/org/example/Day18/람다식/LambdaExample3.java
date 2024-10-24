package org.example.Day18.람다식;

public class LambdaExample3 {
    public static void main(String[] args) {
        LambdaEx3 le = (a,b) -> a-b;
        System.out.println(le.subrtact(10,4));
    }
}
