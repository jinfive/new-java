package org.example.Day18.Question;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; //홀수만 필터링하여 합을 구한 후, 출력하시오.

        System.out.println(Arrays.stream(arr)
                .filter(n ->n % 2 == 1)
                .sum());

        int[] arr2 = {5, 3, 10, 40, 2}; //가장 큰 값을 구한 후, 출력하시오.
        Arrays.sort(arr2);
        System.out.println(Arrays.stream((arr2)).max().getAsInt());
        int[] arr3 = {1, 2, 2, 5, 5, 6, 7, 7, 9, 10};// 5보다 큰 수들을 필터링하여 중복을 제거한 후, 목록을 출력하시오.
            Arrays.stream(arr3)
                    .filter(n ->n >5)
                    .distinct()
                    .forEach(System.out::println);
    }
}
