package org.example.day5.array2;

import java.util.Arrays;
import java.util.Scanner;

public class LastQ3 {
    public static void main(String[] args) {
        /*
        학생들의 점수를 분석하는 프로그램을 만들려고 한다. 키보드로부터 학생 수와 각 학생들의 점수를 입력받고
        while문과 Scanner를 이용해서 최고 점수 및 평균 점수를 출력하는 코드를 작성해보세요.
         */
        Scanner sc = new Scanner(System.in);
        int[] arr = null;
        while (true) {

            System.out.println("---------------------------------------------------------");
            System.out.println("1.학생수\t\t2.점수입력\t\t3.점수리스트\t\t4.분석\t\t5.종료");
            System.out.println("---------------------------------------------------------");
            System.out.print("선택>>");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("학생수 입력>>>");
                    int a =sc.nextInt();
                    arr = new int[a];
                    break;
                case 2:
                    for (int i = 0; i <arr.length ; i++) {
                        System.out.println("arr["+i+"]>>");
                        arr[i] = sc.nextInt();
                    }
                    break;
                case 3:
                    for (int i = 0; i <arr.length ; i++) {
                        System.out.println("arr["+i+"]"+arr[i]);
                    }
                    break;
                case 4:
                    Arrays.sort(arr);
                    System.out.println("최고점수>>"+ arr[arr.length-1]);
                    System.out.println("최저점수>>"+ arr[0]);
                    int sum = 0;
                    for (int i = 0; i < arr.length ; i++) {
                        sum += arr[i];
                    }
                    System.out.println("평균은"+(double)sum/arr.length);
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    System.exit(0);
                    break;
            }//switch
        }//while
    }
}
