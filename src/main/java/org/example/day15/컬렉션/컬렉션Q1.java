package org.example.day15.컬렉션;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class 컬렉션Q1 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("고성");
        set.add("천안");
        set.add("파주");
        set.add("평양");
        set.add("횡성");

        System.out.println(set);
        //반복문 이용해서 하나씩 꺼내와서 처리
        //순서 없음
        //인덱스 없어서 for -each ㄱㄴ
        for (Object o : set) {
            System.out.println(o);
        }//for
        //새로운 반복 법
        //이터레이터
        Iterator it = set.iterator();
        while (it.hasNext()) { // 꺼내줄게 있으면?
            Object x = it.next();//꺼내줌.
            System.out.println(x);
        }
    }
}
