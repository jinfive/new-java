package org.example.day5.array2;

import java.util.Scanner;

public class Practicestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("핸드폰 번호를 입력하세요>>");
        String hp = sc.nextLine();

        hp = hp.trim();//양쪽 공백제거
        System.out.println(hp);

        switch (hp.substring(0, 3)) {
            case "011":
                System.out.println("SK");
                break;
            case "019":
                System.out.println("LG");
                break;
            default:
                System.out.println("apple");
                break;
        }//case

        String[] phone = hp.split("-");

        if(phone[1].length() > 3){
            System.out.println("최신 휴대폰 입니다.");
        }//if
        else System.out.println("구형 번호 입니다");

        if(hp.length()>=10){
            System.out.println("유효한 번호입니다.");
        }//if
        else {
            System.out.println("유효한 번호가 아닙니다,");
        }


    }//main
}//class
