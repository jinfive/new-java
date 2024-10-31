package org.example.day22.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        /*
         int[] s5 = {11, 3, 78, 9, 2, 2, 100, 3};
   int[] s6 = new int[s5.length];
   s5의 원소들을 s6으로 역순으로 옮겨 프린트
         */
        int[] s5 = {11, 3, 78, 9, 2, 2, 100, 3};
        int[] s6 = new int[s5.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s5.length; i++) {
            list.add(s5[i]);
        }
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
