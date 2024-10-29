package org.example.day21.선형;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열을컬랙션{
    public static void main(String[] args) {
        Integer[] x ={1,2,3,4,5};
        //1-1 x배열의 원소를 하나씩 꺼내서 10을 곱한후 list에 모아보자
        List<Integer> list1 = new ArrayList<>();
        for(int s : x){
            list1.add(s * 10);
        }
        System.out.println("1-1>>>"+list1);
        //1-2 Collections.reverse()로 역순으로 정렬
       Collections.reverse(list1);
        System.out.println("1-2>>>"+list1);

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(x));
        list3.add(6);
        list3.add(7);
        System.out.println("3-1>>>"+list3);
    }
}
