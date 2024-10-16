package org.example.day12.상속;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class 상속응용 {
    public static void main(String[] args) {
        //고정,같은타임 ,많은양-->배열
        //가변,같은(디른)타입,많은수 -->ArrayList
        ArrayList list = new ArrayList();
        list.add(10000);
        list.add("지갑");
        list.add("노트북");
        list.add("25.5");
        list.add(new Date());
        System.out.println(list);

        list.remove("볼펜");
        list.remove(0);
        System.out.println(list);

        System.out.println("--------------------------------------------");
        Object[] list2 =new Object[2];
        list2[0] = 100;
        list2[1] = "안녕하세여";
        System.out.println(Arrays.toString(list2));
    }
}
