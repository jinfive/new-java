package org.example.day8.class사용;

import org.example.day8.class만들기.계산기2;

import java.util.Arrays;

public class 계산기사용 {
    public static void main(String[] args) {
        계산기2 cal = new 계산기2();
        //계산기2에 있는 모든 메서드를 호출하여
        //변수에 넣은 후, 출력
        System.out.println(cal.add(100,200));
        System.out.println(cal.add(100,200.0));
        System.out.println(cal.add(2.0,3.0));
        System.out.println(cal.add("안녕",3));
        System.out.println(cal.add("안녕",3.0));
        System.out.println(cal.call());
        //배열값을 찍어보자
        int[] result = cal.add("안녕",3.0);
        //배열 전체값 출력
        //1.fori
        //2.for :
        //3.Arrays.toString(배열명)
        System.out.println(Arrays.toString(result));



    }
}
