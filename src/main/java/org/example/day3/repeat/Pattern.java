package org.example.day3.repeat;

import javax.swing.*;

public class Pattern {
    public static void main(String[] args) {
        //숫자누적

        int sum = 0;//누적용 변수 , 반복문안에 안 넣을게
        for (int i = 100; i < 1000; i++) {
           sum +=i;  //sum = sum + 1 ;
        }
        //문자열 누적
        String sum2 =""; //누적용일때만 ""로 초기화 아닐땐,Null로 초기화
        for (int i = 0; i <3; i++) {
            String data = JOptionPane.showInputDialog("과목입력");

            sum2 += data;
        }
        System.out.println(sum);
        System.out.println(sum2);

    }
}
