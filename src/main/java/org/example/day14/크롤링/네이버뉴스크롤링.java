package org.example.day14.크롤링;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class 네이버뉴스크롤링  {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://news.naver.com/").get();
       String s = doc.select("span.Nitem_link_menu").get(1).text();
        System.out.println(s);
    }
}
