package org.example.day3.repeat;

import java.util.Random;

public class for1 {
    public static void main(String[] args) {

        Random r = new Random();


        for (int i = 0 ; i <3 ;i++){
            System.out.println("환영합니다");
        }

        System.out.println("100~200까지 정수를 출력해 봅니다.");
        int i = 100;
        while (i<201){
            System.out.println(i);
            i++;
        }

        System.out.println("랜덤 함수를 생성합니다");
        for(int j = 0 ; j < 5 ; j ++){
            System.out.println(r.nextInt(100));
        }
    }
}
