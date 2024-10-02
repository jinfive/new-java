package org.example.day5.array2;

import java.util.Arrays;
import java.util.Random;

public class LastQ1 {
    public static void main(String[] args) {
        /*
        1. 랜덤한값 1부터 100사이의값을 20개 만들어배열에넣어출력
        2. 배열에있는값들을오름차순으로정렬후 출력
        3. 배열에들어있는값의최대값을찾아출력
        4. 배열에들어있는값의최소값을찾아출력
         */
        Random r = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100)+1;
        }//for
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//오름차순 정렬후 출력
        System.out.println("배열의 최댓값>>>"+arr[arr.length-1]);
        System.out.println("배열의 최솟값>>>"+arr[0]);


    }//main
}//class
