package org.example.day6.array3;

import org.jsoup.Jsoup;

public class JsoupTest {
    public static void main(String[] args) {
        Jsoup.connect("https://finance.naver.com/sise/");
        System.out.println("인터넷 연결");

    }
}
