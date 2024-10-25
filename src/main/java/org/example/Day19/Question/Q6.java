package org.example.Day19.Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Q6 {
    /*
     List<Integer> list2 = Arrays.asList(55, 66, 88, 99, 99, 55, 100);을 스트림으로 만들어
   중복을 제거후, 오름차순으로 정렬한 후 최소값을 구하시오.
     */
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(55, 66, 88, 99, 99, 55, 100);
        IntStream i =list2.stream().mapToInt(Integer::intValue).distinct();
        IntStream i2 = list2.stream().mapToInt(Integer::intValue).distinct();
        i.forEach(System.out::println); // 각 요소를 출력

        System.out.println(i2.min().getAsInt());


    }
}
