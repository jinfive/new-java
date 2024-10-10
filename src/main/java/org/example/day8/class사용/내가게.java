package org.example.day8.class사용;

import org.example.day8.class만들기.계산기;

public class 내가게 {
    public static void main(String[] args) {
        계산기 cal =new 계산기();
        int result1= cal.plus(100,200);
        int result2= cal.plus(100,300);

        int total = cal.plus(result1,result2);

        System.out.println("두번더해서 나온 총합은\t"+total);


        cal.뺴기(300,200);
        //void인 경우,바로 출력할 수도,연산도 불가능!
        //뺴기 메서드는 void타입
        //System.out.println(cal.뺴기(300,200));>>오류나요

    }
}
