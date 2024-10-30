package org.example.day22.문풀;

import java.util.Arrays;

public class Q12 {
    //숫자찾기 2번
    public static void main(String[] args) {
        int num = 29183;
        int k = 1;
        int index = 0;//index +1
        //int --> String -->char[]
        String num2 =String.valueOf(num);//int -> String
        //String num2 = num +"";
        char[] chars = num2.toCharArray();
        //int index1 = Arrays.binarySearch(chars, (char) 1);배열이 정렬되어 있어야 올바르게 작동합

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] - '0' ==k){
                index = i+1;
            }
        }//for
        System.out.println(index);
    }
}
