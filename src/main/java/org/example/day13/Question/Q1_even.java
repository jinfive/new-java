package org.example.day13.Question;

public class Q1_even extends Thread {
    @Override
    public void run() {
        for (int i = 100; i <= 500; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }//for
    }//run
}//class
