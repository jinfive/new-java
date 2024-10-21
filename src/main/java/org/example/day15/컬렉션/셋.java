package org.example.day15.컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 셋 {
    public static void main(String[] args) {
        //로또 만들기 중복되지 않은 값 6개,랜덤하게,
        Random r = new Random();
        HashSet lotto =new HashSet();

        while (lotto.size()<7){
            int data =r.nextInt(45)+1;
            lotto.add(data);
        }
        System.out.println(lotto);

    }
}
