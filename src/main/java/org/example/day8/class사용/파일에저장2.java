package org.example.day8.class사용;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class 파일에저장2 {
    public static void main(String[] args) {
        //경로는 /Users/jin-o/Downloads/kjo/newjava/data/ 여기에
        //주말동안 할 일 입력받아 저장
        //할일이 "운동"이면 파일명은 "운동.txt"
        //입력은 2회 받음.
        //1.주말동안 할일은?(운동,코딩,여행 등..)
        //2.구체적인 내용입력(장소-시간-내용을 입력)
        //파일은 3개이상 만들어지도록 처리
        Date date = new Date();
        String ymd = date.getYear() + 1900 + "" + (date.getMonth() + 1) + "" + date.getDate();
        System.out.println(ymd);
        String hms = date.getHours() + "" + date.getMinutes() + "" + date.getSeconds();
        System.out.println(hms);
        String time = ymd + hms;

        String s = JOptionPane.showInputDialog("주말동안 할일은?(운동,코딩,여행 등..)");
        String s1 = JOptionPane.showInputDialog("구체적인 내용입력해주세요.장소-시간-내용");

        String[] total = s1.split("-");

        try {
            FileWriter f = new FileWriter("/Users/jin-o/Downloads/kjo/newjava/data/"+time+".txt");
            f.write(s +"\n");
            for(String x:total){
                f.write(x+"\n");
            }//for
            f.close();
        }//try
        catch (IOException e) {
            System.out.println(" ");
            System.out.println("파일 다룰 때 에러가 발생함.");
            e.printStackTrace();//에러 정보 구체적으로 프린트!
            System.out.println(e.getMessage()); //에러 정보 간단하게 스트링으로 리턴!

            //에러 정보 구체적으로 프린트!
            //에러 정보 간단하게 스트링으로 리턴!
        }//catch

    }
}
