package org.example.day23.스레기본;

public class 스레드메인2 {
    public static void main(String[] args) {
        //스레드 객체 생성
     Thread t1 = new Thread(new 스레드만들기());
     Thread t2 = new Thread(new 스레드만들기2());

     t1.start();
     t2.start();
    }
}
