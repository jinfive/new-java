package org.example.day12.상속;

public class 멀티스레드2 {
    public static void main(String[] args) {
        ThreadQ1 t1 = new ThreadQ1();
        ThreadQ2 t2 = new ThreadQ2();
        t1.start();
        t2.start();

    }//main
}//class
