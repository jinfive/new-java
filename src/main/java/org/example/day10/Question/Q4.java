package org.example.day10.Question;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q4 {
    public static void main(String[] args) {
        String text = "전화번호는 010-456-7890과 02-654-3210입니다.";
        String regex = "d{3}-\\d{3,4}-\\d{4}";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // 패턴을 찾고 출력하기
        while (matcher.find()) {
            System.out.println("찾은 전화번호: " + matcher.group());
        }


    }
}
