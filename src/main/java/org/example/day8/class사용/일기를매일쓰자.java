package org.example.day8.class사용;

import org.example.day8.class만들기.일기장;

public class 일기를매일쓰자 {
    public static void main(String[] args) {
        일기장 day1= new 일기장();
        //day1 ==> 참조형 변수 (주소)
        //주소를 가지고 필드 접근,맴버매서드 실행할 수 있음.
        day1.tiltle = "목요일 입니다.";
        day1.content = "와~ 내일은 금요일이다;" ;
        day1.weather =" 흐림";

        day1.일기쓰다();
        System.out.println(day1.tiltle +" "+day1.content+" "+day1.weather);

    }//main
}//class
