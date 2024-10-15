package org.example.day10.Question;

public class 통장사용 {
    public static void main(String[] args) {
        //인스턴스 변수 3개 이름,ssn돈
        통장 dad =new 통장("홍길동","050505",100000);
        System.out.println(dad);
        System.out.println(dad.count);

        통장 my =new 통장("김길동","0505",10000000);
        System.out.println(my);
        System.out.println(my.count);




    }
}
