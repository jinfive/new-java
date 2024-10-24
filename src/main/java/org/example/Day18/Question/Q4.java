package org.example.Day18.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("파인애플","송아지" , "양" ,"스마일" ,"소");
        List<String> result = strings.stream()
                .filter(n -> n.length()==1)
                .collect(Collectors.toList());
        System.out.println(result);

        List<String> images = Arrays.asList("1.png","2.png","3.jpeg","4.jpeg");
        List<String> result2 = images.stream()
                .filter(n -> n.endsWith("jpeg"))
                .collect(Collectors.toList());
        System.out.println(result2);
    }
}
