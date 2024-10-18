package org.example.day14.크롤링;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.swing.*;
import java.io.IOException;
import java.lang.annotation.Documented;

public class 크롤링테스트 {
    public static void main(String[] args) throws IOException {
       // String s = JOptionPane.showInputDialog("날씨 입력");//return String
        Connection con = Jsoup.connect("https://www.naver.com/");//외부 연결인데도 불구하고,connect메서드 내부에서 자체적으로 try-catch진행
        //return이 Connection>> 연결통로를 나타내는 스트림 객체

        Document doc =con.get(); //return 이 Document
        //Document doc2 =  Jsoup.connect("https://www.naver.com/").get();


        // System.out.println(doc);
        System.out.println("설치 성공!!!");
        Elements list  = doc.select("span.blind");//여러개
        //Elements 는 Arraysist 상속
        System.out.println(list.size());
        System.out.println(list);

        Element e1  = list.get(0); //<span class = "~~~">검색<~
        String e1Text = e1.text();//검색
        System.out.println(e1Text);

        Element e2  = list.get(1);
        String e2Text = e2.text();
        System.out.println(e2Text);
    }
}
