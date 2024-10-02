package org.example.day5.array2;

import java.util.Arrays;

public class ArrayP1 {
    public static void main(String[] args) {
        String[] sub ={"국어","영어","수학","컴퓨터","화학"};
        int[] arr1 = {44, 66, 22, 99, 100};
        int[] arr2 = arr1.clone();

        arr2[0] = 22;
        arr2[2] = 88;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int count = 0;
        int count1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                count++;
            }//if
            else if (arr1[i] < arr2[i]) {
                count1++;
                System.out.print("성적이 오른 과목명 "+sub[i]);
            }//elif

        }//for
        System.out.println();
        System.out.println("성적이 동일한 과목수"+count);
        System.out.println("성적이 오른 과목수"+count1);

    }//main
}//class
