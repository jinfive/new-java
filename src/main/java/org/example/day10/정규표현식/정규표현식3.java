package org.example.day10.정규표현식;

import java.util.Scanner;
import java.util.regex.Pattern;

public class 정규표현식3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력>>>");//한글입력, 3-4글자이여야함
        String name = sc.nextLine();
        boolean result1 = Pattern.matches("^[가-힣]{3,4}$", name);
        if (result1) {
            System.out.println(name +"님 환영합니다");
        }//If
        else {
            System.out.println("이름을 다시 입력해주세요");

        }
        //정확히 입력 해다면 ~님한영합니다.
        //아니면 :다시 입력하세요" 출력
        System.out.print("나이 입력>>");//숫자만 이루어졌는지 확인
       String age = sc.nextLine();
        boolean result2 = Pattern.matches("^[0-9]+$",age);
        if (result2) {
            int age1 = Integer.parseInt(age);
            System.out.println("만 나이는:"+(age1-1));
        }//if

        //숫자로 이루어졌으면 Integer.parseIt()로 숫자변환후 만으로 -1 하기
        System.out.print("이메일(com) 입력>>");// 이메일 영문 + 숫자 포함한
        String email = sc.nextLine();
        boolean result3 = Pattern.matches("^[a-zA-Z0-9]{5,8}(_[a-zA-Z0-9]{1,8})?@[a-zA-Z0-9]+\\\\.com$\"",email);
        if (result3) {
            System.out.println("유효한 이메일 입니다");
        }//If
        else {
            System.out.println("유효한 이메일이 아닙니다.");
        }//else
        //영문 + 숫자 _(언더바) 포함한 5-8 글자
        //new.com 포함
        //유효하면 유효한 이메일입니다 출력
        //유효하지않면 유효하지 않은 이메일입니다 출력

        sc.close();
    }
}
