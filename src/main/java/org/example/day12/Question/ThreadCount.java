package org.example.day12.Question;

public class ThreadCount extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 500 ; i++) {
            System.out.println(i);
        }//for
    }//run
}
