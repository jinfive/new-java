package org.example.day10.Question;

public class Q3Main {
    public static void main(String[] args) {
        Q3 work1 =new Q3(25,'여',"홍길동");
        Q3 work2 =new Q3(24,'남',"송길동");
        Q3 work3 =new Q3(26,'여',"홍길동");

        System.out.println("우리회사 직원수는"+Q3.count);
        System.out.println(work1.toString());
        System.out.println(work2.toString());
        System.out.println(work3.toString());

        System.out.println("우리회사 평균 나이>>"+Q3.totalage/Q3.count);
    }
}
