package org.example.day21.Question;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        /*
        String s4 = "마사아차가나"; 오름차순으로 정렬 후 프린트
         */
        String s4 = "마사아차가나";
       char[] s5 = s4.toCharArray();
       Arrays.sort(s5);
       String s6 = new String(s5);
       System.out.println(s6);


    }
}
