package org.example.day12.Question;

public class ThreadCount extends Thread {
    //필드
    //메서드 ->기능이 중요
    //묵시적public void run() >> 동시에 실행하고 싶은 내용
    //                            상속을 받아서 비어있는 상태
    // public void start{}
    //JVM은 실행 목록을 가지고 있음.
    //실행 할 것들들 실행목록에 리스트업해두고
    //스레드는 왔다갔다 하면서 조금씩 실행함.

    @Override
    public void run() {
        for (int i = 500; i >0 ; i--) {
            System.out.println("카운터 감소>>>"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }//for
    }//run
}
