package org.example.day14.크롤링;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Ssgcom {
    public void crowl()throws Exception{
        Document doc = Jsoup.connect("https://www.ssg.com/").get();
        Elements price = doc.select("div.ssgitem_pricewrap > div.ssgitem_price.ty_new > em");
        System.out.println(price.get(0).text());
//        String tittle = doc.select("div.ssgitem_tit")
//        System.out.println(tittle);
    }//크롤
}//class
