package org.example.day11.Question;

public class StudentMain {
    public static void main(String[] args) {
        Course course1 = new Course("Programming",5);
        course1.students = new Student[course1.maxStudents];
        course1.subjects = new Subject[course1.maxStudents];
        course1.studentCount = 0;
        course1.subjectCount = 0;




//        Course course = new Course();
//        course.courseName = "Programming";
//        course.maxStudents = 5;
//        course.students = new Student[course.maxStudents];
//        course.subjects = new Subject[course.maxStudents];
//        course.studentCount = 0;
//        course.subjectCount = 0;

        Student student1 = new Student("전산과",4,20191,"카리나");
        Student student2 = new Student("통신과",4,20192,"윈터");
        Student student3 = new Student("정보과",3,20193,"안유진");
        Student student4 = new Student("전자과",2,20194,"장원영");

        Subject subject1 = new Subject("웹서버 프로그래밍",100);
        Subject subject2 = new Subject("리눅스 프로그래밍",90);
        Subject subject3 = new Subject("네트워크 프로그래밍",80);
        Subject subject4 = new Subject("자바 프로그래밍",70);

        course1.addStudent(student1);
        course1.addStudent(student2);

        course1.addSubject(subject1);
        course1.addSubject(subject2);
        course1.displayStudents();
        course1.displaySubjects();


    }
}
