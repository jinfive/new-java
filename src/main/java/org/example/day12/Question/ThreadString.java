package org.example.day12.Question;

public class ThreadString extends Thread {
    String[] movie ={"대도시의사랑.jpeg","베테랑2.jpeg","와일드로봇.jpeg","조커.jpeg","트랜스포머.jpeg"};

    @Override
    public void run() {
        for (int i = 0; i < movie.length; i++) {
            System.out.println(movie[i]);
        }
    }
}
