package org.example.day21.코딩테스트;

import java.util.Arrays;

public class 배열자르기함수 {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        int[] sub1 = Arrays.copyOfRange(list,1,3);
        //3,4,5
        int[] sub2 = Arrays.copyOfRange(list,2,5);
        System.out.println(Arrays.toString(sub2));
        //1,2,3
        int[] sub3 = Arrays.copyOfRange(list,0,3);
        System.out.println(Arrays.toString(sub3));
        System.out.println(Arrays.toString(sub1));
    }
}
