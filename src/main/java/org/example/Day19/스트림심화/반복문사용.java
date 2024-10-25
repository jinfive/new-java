package org.example.Day19.스트림심화;

import java.util.Arrays;

public class 반복문사용 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        boolean result = Arrays.stream(intArr).allMatch(x -> x >= 8);
        System.out.println(result);
        if(result){
            System.out.println("모두3이상");
        }
        else {
            System.out.println("모두3이상이 아니다");
        }


        System.out.println("-----------------------------------");
        Arrays.stream(intArr)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println); //맨끝에

        System.out.println("-----------------------------------");
        int sum = Arrays.stream(intArr)
                .filter(i -> i % 2 == 0)
                .peek(i -> System.out.println(i)).sum(); //중간결과 출력 하고 싶을때.
        System.out.println(sum);
    }
}
