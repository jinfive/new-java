package org.example.day8.class사용;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class 파일에저장 {
    public static void main(String[] args) {
        //날짜,제목,내용을 입력해서
        //날짜별 파일에 저장
        //위치는 /Users/jin-o/Downloads/kjo/newjava/data 여기에 저장을 해보자
        Date date = new Date();
        String ymd = date.getYear() + 1900 + "" + (date.getMonth() + 1) + "" + date.getDate();
        System.out.println(ymd);
        String hms = date.getHours() + "" + date.getMinutes() + "" + date.getSeconds();
        System.out.println(hms);
        String s1 = ymd + hms;
        //String s2 = JOptionPane.showInputDialog("제목입력");
        //String s3 = JOptionPane.showInputDialog("내용입력");
        String s =JOptionPane.showInputDialog("제목 -내용 순서대로 입력");
        System.out.println(s);
        String[] total =s.split("-");
//        String s2 = total[0];
//        String s3 = total[1];
        //파일생성하고 s1, s2, s3를 저장하고 싶음.
        try {
            FileWriter f = new FileWriter("/Users/jin-o/Downloads/kjo/newjava/data/" + s1 + ".txt");
            f.write(s1 + "\n");
//            f.write(s2 + "\n");
//            f.write(s3 + "\n");
            for(String x:total){
                f.write(x + "\n");
            }
            f.close(); //통로(자바-외부파일/네트워크 연결), 연결(connection)
            //스트림(강물), stream
        } catch (IOException e) {
            System.out.println("파일 다룰 때 에러가 발생함.");
            System.out.println("파일 다룰 때 에러가 발생함.");
            e.printStackTrace();//에러 정보 구체적으로 프린트!
            System.out.println(e.getMessage()); //에러 정보 간단하게 스트링으로 리턴!

        }

    }//main
}//class
