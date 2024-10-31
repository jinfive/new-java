package org.example.day23.스레기본;

public class 스레드메인인터페이스익명람다사용 {
    public static void main(String[] args) {
        //익명클래스 생성
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <100; i++) {
                System.out.println("==> 나는 별!!!");
            }
        });
        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100; i++) {
                    System.out.println("==> 나는 달러!!!");
                }
            }
        };
        t1.start();
        t2.start();
    }
}
