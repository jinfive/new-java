package org.example.day4.array;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class 배열패턴 {
    public static void main(String[] args) {
        //1. 배열을 만들어서 나중에 반복문을 이용해서 데이터 많이 넣기
        int[] jumsu = new int[5]; //{0,0,0,0,0}
        Random r = new Random(100); // 아무 값이나 만들어주는 부붐

        for (int i = 0; i < jumsu.length; i++) {
            //jumsu[i]= Integer.parseInt(JOptionPane.showInputDialog("숫자를 입력하세요"));
            jumsu[i] = r.nextInt(100); //int 범위 -21 억 ~ +21 억
        }//for 종료
        System.out.println(Arrays.toString(jumsu));//Arrays.toString(배열) [ 100, 100,....]출력
        System.out.println("-------------------------------------------");
        //2.배열의 있는 값을 꺼내어 누적
        int sum = 0;
        for (int x : jumsu) {
            sum = sum + x;
            //앞의 sum:새 값까지 누적된 값
            //뒤의 sum:이전까지 더해진 값
        }//for
        System.out.println(sum);
        System.out.println("--------------------------------------------");
        //3.배열에 있는 값을 반복해서 처리하는데,조건이 있는 경우
        sum = 0;
        for (int x : jumsu) {
            if (x > 80) {
                sum = sum + x;
            }//if
        }//for
        System.out.println(sum);
        System.out.println("--------------------------------------------");

        //4.배열에 있는 값을 가지고 위치를 찾는 경우>>>>코딩 테스트 빈출
        for (int i = 0; i < jumsu.length; i++) {
            if (jumsu[i] ==88) {
                System.out.println("88찾았다");
                System.out.println(i+1 +"번째");
                break; // 반복문 종료
            }//if
        }//for

    }//main
}//class
