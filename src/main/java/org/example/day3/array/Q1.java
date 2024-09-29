package org.example.day3.array;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        /*
        1. 정수 배열을 만들어 11, 22, 33, 44, 55를 넣으세요.
                (처음부터 값을 알고 있는 경우)
                1-1. 첫번 째 값을 프린트
                1-2. 세번 째 값을 프린트
                1-3. 마지막 값을 프린트
                1-4. 전체 프린트

         */
        int[] array = {11,22,33,44,55};
        System.out.println(array[0]);
        System.out.println(array[2]);
        System.out.println(array[array.length-1]);
        System.out.println(Arrays.toString(array)); //[11, 22, 33, 44, 55] 출력
        for(int x:array){
            System.out.print(x + "  ");
        }

    }
}
