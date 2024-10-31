package org.example.day23.스레기본;

public class 익명클레스스레드생성 {
    public static void main(String[] args) {
        //익명클래스 생성
        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("---나는 별----");
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                System.out.println("---나는 나----");
            }
        };
        t1.start();
        t2.start();
    }
}
