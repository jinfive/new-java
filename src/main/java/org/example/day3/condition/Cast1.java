package org.example.day3.condition;

public class Cast1 {
    public static void main(String[] args) {
        //타입이 다른 변수에 넣어야 하는 경우
        //자동(작은 공간 >> 큰공간) 묵시적 형변환
        byte x =100;
        int y = x;
        System.out.println(y);


        //강제(큰공간>작은공간) 명시적 형변환
        int x2 = 100;
        byte y2 =  (byte) x2;
        System.out.println(y2);


    }
}
