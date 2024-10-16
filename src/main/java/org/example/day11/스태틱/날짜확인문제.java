package org.example.day11.스태틱;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class 날짜확인문제 {
    public static void main(String[] args) {
        //도서 대여 프로그램>>>
        //LocalDateTime을 이용해서 현재 날짜를 구하세요(시작일)
        //LocalDateTime을 이용해서 2주후 종료 날짜를 구하세요(종료일)

        //만약 종료일이 시작일보다 이후면면,아직 대여중 입니다.
        //종료일이 시작일이랑 동일하다면, 대여 종료날입니다.

        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusDays(2);

        System.out.println(start.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        if(start.isBefore(end)){
            System.out.println("아직대여중");
        }
        else{
            System.out.println("대여중");
        }
    }
}
