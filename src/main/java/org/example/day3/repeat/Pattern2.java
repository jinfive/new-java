package org.example.day3.repeat;

import javax.swing.*;

public class Pattern2 {
    public static void main(String[] args) {
        //숫자누적

        int sum1 = 0;//누적용 변수 ,
        int sum2 = 0;//누적용 변수 ,
        int sum3 = 0;//누적용 변수 ,

        //1부터 499 누적해서 프린트
        for (int i = 1; i < 500; i++) {
            sum1 += i;  //sum = sum + 1 ;
        }
        System.out.println(sum1);

        //1부터 ㅓ100 까지 4의 배수만 누적해서 프린트
        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0) {
                sum2 += i;
            }


        }//for
        System.out.println(sum2);
        for (int i = 500; i >= 1; i = i - 2) {
            if (i % 5 == 0) {
                continue;
            }
            sum3 += i;
        }
        System.out.println(sum3);
        //문자열

    }
}
