package org.example.day3.order;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random r = new Random(); // 아무값을 만들어 주는 클래스
        r.setSeed(100);//시드 값
        //반복문 만들떄는 유한반복 , 무한반복이 있다.
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(99); // 0~ 99 범위
            int num2 = r.nextInt(100) + 1; // 1 ~ 100 범위
            System.out.println(num);
            System.out.println(num2);
        }
    }
}
