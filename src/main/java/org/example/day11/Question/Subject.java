package org.example.day11.Question;

public class Subject {
    String name;//과목명
    int score;

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
