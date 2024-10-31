package org.example.day23.스레기본;

//인터럽트>>스레드 중단하거나 일시적으로 멈추게 하는 메커니즘
class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread is sleeping...");
            Thread.sleep(5000); // 5초 대기
            System.out.println("Thread is awake!");
        } catch (InterruptedException e) {
            // 인터럽트 발생 시 처리 코드 작성
            System.out.println("내가 깨어났다....");
        }
    }
}

public class 인터럽트메서드 {
    public static void main(String[] args) {
        //쓰레드 객체 생성
        MyThread t = new MyThread();
        t.start();
        //2초후에
        try {
            t.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("오류");
        }
        //인터럽트로 깨우자
        t.interrupt();
        //==>실행대기 상태

    }
}
