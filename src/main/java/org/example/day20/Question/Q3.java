package org.example.day20.Question;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        // {66, 33, 55, 22, 11} 중 크기를 기준으로 중앙값은?
        int[] arr = {66, 33, 55, 22, 11};
        Arrays.sort(arr);
        int mid = arr.length / 2;
        System.out.println(arr[mid]);
    }
}
