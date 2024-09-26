package org.example.day2.control;

import java.util.Scanner;

public class 입력연습1 {
    public static void main(String[] args) {
        System.out.print("이름입력>>>");

        Scanner sc = new Scanner(System.in); //실무에서는 사용 안한다 코딩테스트 용
        //수동 import  == > alt +enter

        String name  = sc.next(); //한글자만 받아서 입력
        System.out.print("나이 입력>>>");
        int age = sc.nextInt(); //숫자로 바꿔서 저장
        System.out.print("몸무게 입력>>>");
        double w = sc.nextDouble(); //String --> double

        System.out.println(name + " " + age + " " + w);
        sc.close();
    }
}
