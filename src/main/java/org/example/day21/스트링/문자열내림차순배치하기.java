package org.example.day21.스트링;

import java.util.Arrays;

public class 문자열내림차순배치하기 {
    public static void main(String[] args) {
        String s = "Zbcdefg";

        //소문자앞
        //대 --> 소
        //소문자는 z ~~a
        //소문자 앞 + 대문자 뒤
        //오름차순 정렬
        char[] c = s.toCharArray();
        Arrays.sort(c);//오름차순청렬
        //1.컬렉션으로 만들어서 뒤집기
        //2.sb를 이용해서 뒤집기
        StringBuilder sb = new StringBuilder(new String(c));
        String r =sb.reverse().toString();
        System.out.println(r);

    }
}
