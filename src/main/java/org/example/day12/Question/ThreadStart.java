package org.example.day12.Question;

public class ThreadStart {
    public static void main(String[] args) {
        ThreadCount threadCount = new ThreadCount();
        ThreadString threadString = new ThreadString();
        Threadtime threadtime = new Threadtime();


        threadCount.start();
        threadtime.start();
        threadString.start();


    }
}
