package org.example.day12.상속;

public class Thread2 extends Thread {
    //run() 동시에 실행하고 싶은 코드
    //start() run()안에 있는 코드를 동시에 시작


    @Override
    public void run() {
        for (int i = 100; i > 0; i--) {
            System.out.println("감소>>>>  "+i);
        }//for
    }//run
}//class
