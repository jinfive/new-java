package org.example.day22.Question;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        /*
        int[] s4 = {11, 3, 78, 9, 2, 100} 오름차순 정렬 후
   2번째 큰 값과 2번째 작은 값을 구하세요.
         */
        int[] s4 = {11, 3, 78, 9, 2, 100};
        Arrays.sort(s4);
        System.out.println(Arrays.toString(s4));
        System.out.println(s4[1]);
        System.out.println(s4[s4.length-2]);
    }
}
