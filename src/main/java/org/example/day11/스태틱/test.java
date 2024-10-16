package org.example.day11.스태틱;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        int[] n = {3,5,7,9,1};
        //정렬! 오름차순!
        Arrays.sort(n);//파괴형 메서드
        System.out.println(Arrays.toString(n));
        System.out.println(n);

        String s = Arrays.toString(n);//비파괴형


        Random r = new Random();
        System.out.println(r.nextDouble());

        System.out.println(Math.random());
        double a = Math.random();
        System.out.println(Math.random());
        System.out.println((int)(a*10));

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println(cal.YEAR);
        System.out.println(cal.get(Calendar.YEAR));//년
        System.out.println(cal.get(Calendar.MONTH)+1);//월
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(cal.get(Calendar.AM_PM));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));


    }
}
