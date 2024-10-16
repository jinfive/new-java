package org.example.day11.Question;

public class Student {
    int id;
    String name;
    int grade;
    String department;

    @Override
    public String toString() {
        return "Student{" +
                "department='" + department + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public Student(String department, int grade, int id, String name) {
        this.department = department;
        this.grade = grade;
        this.id = id;
        this.name = name;
    }
}
