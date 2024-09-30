package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto =new int[1000];
        //랜덤한 값 시드 42 1000개를 넣어 만드세요
        Random random = new Random(42);
        //범위는 1부터 45
       for (int i = 0; i < lotto.length; i++) {
           lotto[i] = random.nextInt(45)+1;
       }//for

        System.out.println(Arrays.toString(lotto));
       //카운트 누적변수
        //패턴 3번
        int count = 0;
        for(int x : lotto){
            if(x >= 15){
                count++;
            }//if
        }//for
        System.out.println(count);



    }
}
