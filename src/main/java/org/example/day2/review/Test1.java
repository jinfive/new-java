package org.example.day2.review;

public class Test1 {
    public static void main(String[] args) {
        //기본형 변수 정리 - 정수 , 실수 , 문자 한글자 ,논리
        byte today = 26; //-128 ~ 127
        float temp = 23.5f;// ==> double
        final char DAY = '목';
        boolean food = true;

        String roomNo = "강의장 6";

        // 변수 값 출력
        System.out.println("오늘 날짜: " + today);
        System.out.println("현재 온도: " + temp);
        System.out.println("요일: " + DAY);
        System.out.println("식사 여부: " + food);
        System.out.println("강의실 번호: " + roomNo);
    }
}