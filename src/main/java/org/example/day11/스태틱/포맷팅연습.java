package org.example.day11.스태틱;

import java.text.SimpleDateFormat;
import java.util.Date;

public class 포맷팅연습 {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("yyyy년MM월dd일");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("올해의 D번째 날");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("이달의 d번째 날");
        System.out.println(sdf.format(now));


    }
}
