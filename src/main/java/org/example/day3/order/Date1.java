package org.example.day3.order;

import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        //입력할때 자동으로 연월일 시분초 구해주고 싶다
        Date date = new Date();
        int year = date.getYear() + 1900;//년
        int month = date.getMonth()+ 1; //월
        int date1 = date.getDate(); //일
        int day = date.getDay();
        int hour = date.getHours();//시
        int minute = date.getMinutes();//분
        int second = date.getSeconds(); //

        System.out.println(year+ " " + month + " " + date1 + " " + day + " " + hour + " " + minute + " " + second);

        //오늘 무슨 요일인지 프린트
        switch (day) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
            case 7:
                System.out.println("일요일");
                break;
            default:
                System.out.println("유효하지 않은 입력입니다. 1부터 7까지의 숫자를 입력하세요.");
                break;
        }

    }
}
