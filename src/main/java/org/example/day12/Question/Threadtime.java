package org.example.day12.Question;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Threadtime extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            LocalDateTime now = LocalDateTime.now();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            System.out.println(now.format(formatter));
        }

    }
}
