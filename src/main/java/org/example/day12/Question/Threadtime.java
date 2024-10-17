package org.example.day12.Question;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Threadtime extends Thread {
    LocalDateTime now = LocalDateTime.now();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println(now.format(formatter));
            try {
                Thread.sleep(5000); //1초 1000 >>500 (0.5초)
            } catch (InterruptedException e) {
                System.out.println("문제 발생");
            }
        }

    }
}
