package org.example.Day19.Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
    /*
     가고 싶은 곳 5개(산 2개 이상 넣음)를 String[]에 넣은 후,
   스트림으로 만들고 글자가 "산"으로 끝나는 것을 모아 중간에 한번 출력 후
   List<String>으로 모은 후 list를 출력
     */
    public static void main(String[] args) {
        String[] str = {"북한산","설악산","관악산","춘천","하얼빈"};

        List<String> result = Arrays.stream(str)
                .filter(x ->x.endsWith("산"))
                .collect(Collectors.toList());
        System.out.println(result);
    }

}
