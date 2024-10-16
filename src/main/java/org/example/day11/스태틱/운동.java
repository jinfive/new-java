package org.example.day11.스태틱;

public class 운동 {
    static int count;
    private static int totalTime;

    String play;
    String people;
    int time;

    public 운동(String play, String people, int time) {
        this.play = play;
        this.people = people;
        this.time = time;
        count++;
        totalTime += time;
    }

    public int getTime() {
        return totalTime;
    }

    @Override
    public String toString() {
        return "운동{" +
                "people='" + people + '\'' +
                ", play='" + play + '\'' +
                ", time=" + time +
                '}';
    }
}
