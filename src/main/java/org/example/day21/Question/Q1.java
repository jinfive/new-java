package org.example.day21.Question;

import java.util.Arrays;

public class Q1 {
    //, 기준으로 오름차순 정렬후 프린트
    public static void main(String[] args) {
        String s= "감,위,배";
        String[] str = s.split(",");
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        StringBuilder sb = new StringBuilder();
        for(String x : str){
            sb.append(x);
        }
        System.out.println(sb);
        String a = new String(sb);
        System.out.println(a);

        String result = String.join("", sb);
        System.out.println(result);



    }
}
