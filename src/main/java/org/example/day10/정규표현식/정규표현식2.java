package org.example.day10.정규표현식;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 정규표현식2 {
    public static void main(String[] args) {
        String name = "김길동";
        String tel = "010-1234-5678";
        String email = "test@naver.com";

        //입력한 문제 열에대한 유효성 검사! ==>정규 표현식 사용해라
        //자바에서 정규표현식 사용법.
        //1.Pattern.matches(패턴 문자열,검증받고 싶은 문자열); --> boolean(t ,f)
        //2.패턴을 미리 등록
        //Pattern p = Pattern.compile(패턴 문자열) --> 패턴을 나태내는 부품 Pattern
        //Matcher m = p.matcher(검증받고 싶은 문자열)--> 어떤 패턴을 어떤 문자열의 부분으로 검증했는지
        // 정보를 가지고 있는 부품 Matcher
        //boolearn result m2.fine() --> boolearn

        System.out.println(Pattern.matches("^[가-힣]*$",name));
        System.out.println(Pattern.matches("^010-\\d{3,4}-\\d{4}$",tel));
        System.out.println(Pattern.matches("\\w+@\\w+\\.\\w+", email));

    }
}
