package org.example.day15.컬렉션;

import java.util.LinkedList;
import java.util.Queue;

public class 큐 {
    public static void main(String[] args) {
        Queue que = new LinkedList();
        //순서 + 선입 선출
        que.add("어제 우유");
        que.add("오늘 우유");
        que.add("내일 우유");
        System.out.println(que);
        que.remove();
        System.out.println(que);
        que.remove();
        System.out.println(que);
    }
}
