package org.example.Day19.Question;

import java.util.Random;

public class Q1 {
    /*
    정수값 100개를 111~222까지 랜덤하게 스트림을 만들어서
    최대값, 최소값, 합계, 평균을 구하시오.
     */
    public static void main(String[] args) {
        Random r  = new Random();
        int sum = r.ints(100,111,222).sum();
        int max =r.ints(100,111,222).max().getAsInt();
        int min =r.ints(100,111,222).min().getAsInt();
        double avg =r.ints(100,111,222).average().getAsDouble();
        System.out.println("모든 수의 합은>>>"+sum);
        System.out.println("최대값은>>>>"+max);
        System.out.println("최소값은>>>>"+min);
        System.out.println("평균은>>>"+avg);

    }
}
