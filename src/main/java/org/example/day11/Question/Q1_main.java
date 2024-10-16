package org.example.day11.Question;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Q1_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date date = new Date();
        System.out.println("id를 입력하세요");
        String id = sc.nextLine();
        System.out.println("pw를 입력하세요");
        String pw = sc.nextLine();
        Q1 q1 = new Q1(id,pw);
        if(q1.login()){
            System.out.println("일기 작성을 시작합니다");
        }//if
        else {
            System.out.println("계정을 다시 입력하세요");
        }//else
        q1.ymd = date.getYear() + 1900 + "" + (date.getMonth() + 1) + "" + date.getDate();
        q1.hms = date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds();
        q1.time = q1.ymd + q1.hms;
        System.out.println(q1.time);

        System.out.println("제목을 입력하세요");
        q1.tittle = sc.nextLine();
        System.out.println("내용을 입력하세요");
        q1.content = sc.nextLine();

        try {
            FileWriter f = new FileWriter("/Users/jin-o/Downloads/kjo/newjava/data/"+q1.time+".txt");
            f.write(q1.tittle+"\n");
            f.write(q1.content+"\n");
            f.flush();
            f.close();
        } catch (IOException e) {
            System.out.println(" ");
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        q1.readDiary(q1.time + ".txt"); // 파일 이름에 .txt 추가

        sc.close();
    }//main
}//class
