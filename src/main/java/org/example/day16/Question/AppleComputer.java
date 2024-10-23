package org.example.day16.Question;

public class AppleComputer implements Computer {
    @Override
    public void restart() {
        System.out.println("에플 컴퓨터를 재시동 합니다");
    }

    @Override
    public void start() {
        System.out.println("에플 컴퓨터를 시작합니다");
    }

    public AppleComputer() {
        this.start();
        this.shutdown();
        this.restart();
    }

    @Override
    public void shutdown() {
        System.out.println("에플 컴퓨터를 종료합니다.");
    }
}
