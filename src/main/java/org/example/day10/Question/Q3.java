package org.example.day10.Question;

public class Q3 {
    String name;
    int age;
    char gender;

    static int totalage = 0;
    static int count = 0;

    public Q3(int age, char gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        count++;
        totalage = totalage + age;
    }

    @Override
    public String toString() {
        return "Q3{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
