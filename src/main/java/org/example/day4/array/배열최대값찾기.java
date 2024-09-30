package org.example.day4.array;

import java.util.Arrays;
import java.util.Scanner;

public class 배열최대값찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("숫자입력>>");
            arr[i] = sc.nextInt();//모든 입력은 string ->>int로 입력 변경.

        }//for문
        System.out.println(Arrays.toString(arr));
        sc.close();//stream 닫힘.

        Arrays.sort(arr);//오른차순 정렬, 맨앞 최솟값,맨끝 최댓값
        System.out.println("최속값  \t" + arr[0]);
        System.out.println("최대값  \t" + arr[arr.length - 1]);

        int max = arr[0];    //해당 인덱스 까지 최대값 넣는 변수
        //for문 순회
        //if(max<save[i]){max = save[i]}
        for (int s : arr){
            if(max>s){
                max=s;
            }//if
        }//for
        System.out.println(max);
    }//main
}//class
