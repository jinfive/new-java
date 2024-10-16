package org.example.day11.Question;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

public class Q1 {
    String id;
    String pw;

    String ymd; // date.getYear() + 1900 + "" + (date.getMonth() + 1) + "" + date.getDate();
    String hms; //date.getHours() + "" + date.getMinutes() + "" + date.getSeconds();
    String time;
    String tittle;
    String content;

    public boolean login() {
        if(id.equals("root") && pw.equals("1234")) {
            return true;
        }
        else return false;
    }//로그인 메서드

    public Q1(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }//생성자
    public void readDiary(String fileName) {
        String filePath = "/Users/jin-o/Downloads/kjo/newjava/data/" + fileName;
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            System.out.println("일기 내용:");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Q1{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }//toString
}
