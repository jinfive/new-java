package org.example.day5.array2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] count = new int[10];

        while (true) {
            System.out.println("좌석  --------------------------------------------------------------------");
            for (int i = 0; i < arr.length; i++) {
                    arr[i] = i + 1;
                    System.out.print(arr[i] +"\t\t\t");
            }//for
            System.out.println();
            System.out.println("예매석 --------------------------------------------------------------------");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(count[i] +"\t\t\t");
            }//for
            System.out.println();
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("예매할 좌석번호를 입력하세요 0 입력시 종료됨.");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            else{
                count[n-1]++;
                System.out.println("예매완료");;
            }//else
        }//while
    }
}
