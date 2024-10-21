package org.example.day15.컬렉션;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class 컬렉션Q3 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("등");
        list.add("시험공부");
        list.add("저녁식사");
        list.add("드라마시청");
        list.add("잠");
        System.out.println(list);
        System.out.println(list.get(0));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for(Object o : list){
            System.out.println(o);
        }//포이치

        Iterator iterator = list.iterator();//반복자
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }//while
    }
}
