package org.example.day22.문풀;

import java.util.Arrays;

public class Q8 {
    //서울에서 김서방 찾기
    public static void main(String[] args) {
        String[] seoul = {"june","kim"};
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("kim")) {
                System.out.println(i);
            }//if
        }//for
        System.out.println(Arrays.binarySearch(seoul, "kim"));//이진 검색
        //3,5,7,8,1
        //1-3-5-7-8
    }
}
