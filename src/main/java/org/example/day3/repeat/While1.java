package org.example.day3.repeat;

import java.util.Date;

public class While1 {
    public static void main(String[] args) {
        //유한 반복 --> 시작값 ,조건 ,증감값
        Date date =new Date();

        int i = 1;// 조건
        int add = 1;//증감

        while (i <= 10){
            System.out.println(i);
            i += add; // 증가 처리 i++ i = i+1
        }//while

        System.out.println("-----------------------------------");
        for (int j  = 1 ; j <= 10 ; j++){
            System.out.println(j);
        }//for
        System.out.println("-----------------------------------");
        while (true){//조건 ==>
            System.out.println("내가 계속 돌아");
            int seconds = date.getSeconds();
            if (seconds >10){
                break;
            }
        }

    }//main
}//class
