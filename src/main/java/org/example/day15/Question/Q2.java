package org.example.day15.Question;

import java.util.LinkedList;

public class Q2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("국어");
        list.add("수학");
        list.add("영어");
        list.add("컴퓨터");
        System.out.println("처음 시험별 과목"+ list);
      for (int i = 0; i < 3; i++) {
          list.remove(0);
          System.out.println((i+1)+ "회차 시험을 한 남은 과목"+ list);
      }
    }
}
