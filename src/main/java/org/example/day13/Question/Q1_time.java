package org.example.day13.Question;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q1_time extends Thread {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            LocalDateTime now = LocalDateTime.now();
            System.out.println(now.format(dtf));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }//for


    }//run
}//class
