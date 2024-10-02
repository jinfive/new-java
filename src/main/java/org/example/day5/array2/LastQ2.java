package org.example.day5.array2;

import java.util.Arrays;
import java.util.Random;

public class LastQ2 {
    public static void main(String[] args) {
        /*
        1. 두 개의 정수 배열을 생성하여 각각 출력
        첫 번째 배열은 1에서 50 사이의 랜덤 값 10개
        두 번째 배열은 51에서 100 사이의 랜덤 값 10개
        2. 첫 번째 배열과 두 번째 배열을 각각 오름차순으로 정렬
        3. 두 배열에서 각각 가장 큰 값들을 더한 결과값 출력
        4. 두 배열에서 각각 가장 작은 값들을 더한 결과값 출력
         */
        Random r = new Random();
        int[] arr = new int[10];
        int[] arr1 = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(50)+1;
            arr1[i] = r.nextInt(50) + 51;
        }//for
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println(arr[arr.length-1] + arr1[arr1.length-1]);
        System.out.println(arr[0] + arr1[0]);
    }//main
}//class
