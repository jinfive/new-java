package org.example.day12.상속;

public class ThreadQ2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5000; i++) {
            System.out.println("김진오");
        }
    }
}
