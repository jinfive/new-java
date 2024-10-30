package org.example.day21.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q5 {
    public static void main(String[] args) {
        /*
        int[] s5 = {55, 100, 77, 88, 22}를 정렬 후 역순으로 int[] s6에 옮겨 프린트
         */
        int[] s5 = {55, 100, 77, 88, 22};
        Arrays.sort(s5);
        int[] s6 = new int[s5.length];
        for (int i = 0; i < s5.length; i++) {
            s6[s5.length-1-i] = s5[i];
        }
        System.out.println(Arrays.toString(s6));
        Solution s = new Solution();
        System.out.println("객체생성으로 문제풀기");
        s.sol(s5);

    }

}

class Solution{
    void sol(int[] n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int x :n){
            list.add(x);
        }
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }

}