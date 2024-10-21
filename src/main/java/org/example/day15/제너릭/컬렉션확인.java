package org.example.day15.제너릭;

import java.util.ArrayList;
import java.util.HashMap;

public class 컬렉션확인 {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("홍길면1");
        list.add("홍길면2");
        list.add("홍길면3");
        list.add("홍길면4");
        list.add("홍길면5");

        String name = list.get(0);
        System.out.println(name);

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"엄마");
        map.put(2,"아빠");
        System.out.println(map.get(1));
    }
}
