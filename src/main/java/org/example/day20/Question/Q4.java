package org.example.day20.Question;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        //{66, 33, 55, 22, 11, 66} 중 크기를 기준으로 중앙값은?
        //   배열의 요소의 길이가 짝수일때는 가운데 있는 값들을 찾아
        //   더한 후 2로 나누어서 찾음.
        int[] arr = {66, 33, 55, 22, 11, 66};
        Arrays.sort(arr);
        if(arr.length % 2 == 0){
            int mid = arr[arr.length / 2]+arr[arr.length / 2 - 1];
            System.out.println(mid/2);
        }

    }
}
