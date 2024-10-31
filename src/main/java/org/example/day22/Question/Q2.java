package org.example.day22.Question;

import java.util.HashMap;

public class Q2 {
    public static void main(String[] args) {
        /*
        HashMap을 이용해서 푸세요.
   String[] s2 = {"밥", "커피", "밥", "커피", "밥", "밥"};
   밥과 커피먹은 횟수 구하여 출력
   밥을 더 많이 먹었으면 "밥을 더 먹었군요"
   커피를 더 많이 마셨으면 "커피를 더 마셨군요"
         */
        String[] s2 = {"밥", "커피", "밥", "커피", "밥", "밥"};
        HashMap<String,Integer> map = new HashMap<>();
        for(String x:s2){
            map.put(x,map.getOrDefault(x,0)+1);
        }//for
        System.out.println(map);
    }//main
}
