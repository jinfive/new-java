package org.example.Day19.Question;

import java.util.Arrays;
import java.util.List;

public class Q3 {
    /*
    먹고 싶은 음식 7개를 List<String>에 넣은 후,
   스트림으로 만들고 글자가 3글자 이상인 것 들만 모아서
   프린트
     */
    public static void main(String[] args) {
        List<String> food = Arrays.asList("피자","치킨","삼겹살","등심","족발","곱창볶음","대창구이");
        food.stream()
                .filter(x -> x.length()>=3)
                .forEach(x -> System.out.println(x));

    }
}
