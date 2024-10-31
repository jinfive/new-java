package org.example.day22.Question;

import java.util.HashMap;

public class Q5 {
    public static void main(String[] args) {
        /*
    5. String s5 = "감고나무감나무신세계신"; 각 글자가 몇 번 나왔는지 프린트
   (HashMap을 이용해서 푸세요.
     */
        String s5 = "감고나무감나무신세계신";
        HashMap<Character, Integer> map = new HashMap<>();
        char[]c = s5.toCharArray();
        for(char x : c){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        System.out.println(map);
    }
}
