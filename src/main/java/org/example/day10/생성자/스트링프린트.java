package org.example.day10.생성자;

import java.util.ArrayList;
import java.util.HashSet;

public class 스트링프린트 {
    public static void main(String[] args) {
        //참조형 변수 프린트시
        //toString()를 먼저 호출해 프린트할 스트링을 만들고 나서
        //그렇게 만들어진 스트링을 프린트 한다.
        int[] n1 ={1,2,3};//배열 , 고정길이
        System.out.println(n1);//[I@7ad041f3

        ArrayList list = new ArrayList();//배열과 유사, 가변
        list.add(100);
        list.add(200);
        System.out.println(list);

        HashSet set = new HashSet();//가열 + 중복제거
        set.add(100);
        set.add(100);
        set.add(200);
        set.add(300);
        System.out.println(set);

    }
}
