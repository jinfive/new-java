package org.example.Day18.Question;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5, 5, 6, 8};
        Arrays.stream(arr)
                .filter(n -> n>3)
                .distinct()
                .forEach(System.out::println);
//List<Integer> 리스트에는 클래스 만들어갈 수 있다.
    //기본형이 들어갈려면 boxed()를 사용해
        //박싱을 해서 클래스로 만들어 줘야한다.

        double[] arr2 = {5.0, 3.0, 1.0, 33.0, 35.0};
        System.out.println(Arrays.stream(arr2).sum());

        String[] arr3 = {"정신과", "내과", "신경과", "정형외과"};
        Arrays.stream(arr3)
                .map(str -> str +"사무실")
                .forEach(System.out::println);
    }
}
