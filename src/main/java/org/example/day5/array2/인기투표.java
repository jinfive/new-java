package org.example.day5.array2;

import java.util.Scanner;

public class 인기투표 {
    public static void main(String[] args) {
        String[] name = {"아이유", "BTS", "창모"};
        int[] tv = new int[name.length];

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("인기투표 0) 아이유 \t 1)BTS \t 2)창모 \t3)종료");
            System.out.print("선택번호>>>>");
            int n = sc.nextInt();
            //무한 루프면 종료시점 명시
            if (n == 3) {
                for (int i = 0; i < name.length; i++) {
                    System.out.println(name[i] +"이 \t" + tv[i]+"표 획득");
                }
                break;
            }//if
            else{
                tv[n] ++;
                System.out.println(name[n] +"이 \t" + tv[n]+"표 획득");
            }

        }//while
        sc.close();
    }//main
}//class
