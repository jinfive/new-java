package org.example.day11.Question;

import java.util.Arrays;

public class Course {
    static Student[] students;//수강신청한 학생 목록
    static Subject[] subjects;//과목목록
    String courseName;//강좌명
    int maxStudents;//최대 수강인원
    int currentStudents;//현재 수강인원
    int studentCount;
    int subjectCount;

    public Course(String courseName, int maxStudents) {
        this.courseName = courseName;
        this.maxStudents = maxStudents;
    }

    void addStudent(Student student){
        if (studentCount < maxStudents) {
            students[studentCount++] = student;
            currentStudents++;
        }
    }//addStudent
    void addSubject(Subject subject) {
        if (subjectCount < maxStudents) {
            subjects[subjectCount++] = subject;

        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", maxStudents=" + maxStudents +
                ", currentStudents=" + currentStudents +
                ", students=" + Arrays.toString(students) +
                ", subjects=" + Arrays.toString(subjects) +
                ", studentCount=" + studentCount +
                ", subjectCount=" + subjectCount +
                '}';
    }

    public void displayStudents() {
        System.out.println("등록된 학생 목록:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
    }

    public void displaySubjects() {
        System.out.println("등록된 과목 목록:");
        for (int i = 0; i < subjectCount; i++) {
            System.out.println(subjects[i]);
        }
    }

    void printCourseInfo(){

    }//강좌 정보 출력


}
