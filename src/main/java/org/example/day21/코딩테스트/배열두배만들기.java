package org.example.day21.코딩테스트;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 배열두배만들기 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = {};

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0){
                list.add(numbers[i] *10);
            }//if
        }//for
        int size = list.size();
        //컬렉션 sort
        Collections.sort(list);
        System.out.println(Arrays.toString(list.toArray()));
        Collections.reverse(list);
        System.out.println(Arrays.toString(list.toArray()));
        answer = new int [size];
        for (int i = 0; i < size; i++) {
            answer[i] = list.get(i);
        }//for
        System.out.println(Arrays.toString(answer));
    }
}






