package org.example.day15.컬렉션;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class 컬렉션Q2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("안방", "Tv");
        map.put("거실", "쇼파");
        map.put("부엌", "냉장고");
        map.put("현관", "신발");

        System.out.println(map.get("부엌"));
        System.out.println(map);
        Set keys = map.keySet();
        System.out.println(keys.contains("내방"));
        Collection values = map.values();
        System.out.println(values.contains("스타일러"));

        for(Object x : keys){
            System.out.println(x + "  "+map.get(x));
        }
    }
}
