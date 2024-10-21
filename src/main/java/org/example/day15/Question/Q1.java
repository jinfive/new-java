package org.example.day15.Question;

import java.util.ArrayList;
import java.util.Iterator;

public class Q1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("박소정");
        list.add("김경민");
        list.add("소지현");
        list.add("김개빈");

        System.out.println("초기 참가자 목록>>" + list);

        list.remove("박소정");

        Iterator iterator = list.iterator();
        System.out.println("박소정 탈락");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1)+"\t등\t"+iterator.next());
        }
    }
}
