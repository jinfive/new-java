package org.example.day14.크롤링;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Queue-ri
 */

public class SSGCrawlingTest {
    public static void main(String[] args) throws Exception {
        SSGCrawler crawler = new SSGCrawler();
        SsgImg ssgImg = new SsgImg();
        crawler.crawl();
        ssgImg.crawlImg();
    }
}//SSGCrawlingTest

class SSGCrawler {
    public void crawl() throws Exception {
        Document doc = Jsoup.connect("https://www.ssg.com/").get();
        //Elements list = doc.select("div.ssgitem_thmb > a");
        Elements titles = doc.select("div.ssgitem_tit");
        Elements brands = doc.select("div.ssgitem_tit > em");
        Elements prices = doc.select("div.ssgitem_pricewrap > div > em");

        final int ITEM_SIZE = titles.size();
        // 텍스트 저장
        String[] titleList = new String[ITEM_SIZE];
        String[] brandList = new String[ITEM_SIZE];
        String[] priceList = new String[ITEM_SIZE];

        int brandIdx = 0;
        for (int i = 0; i < ITEM_SIZE; i++) {
            String titleText = titles.get(i).text();
            String brandText = brands.get(brandIdx).text();
            if (titleText.startsWith(brandText)) {
                brandList[i] = brandText;
                titleList[i] = titleText.substring(brandText.length()).stripLeading(); // lstrip
                ++brandIdx;
            }
            else {
                brandList[i] = "";
                titleList[i] = titleText;
            }
            priceList[i] = prices.get(i).text();
        }

        System.out.println("* * * SSG.COM에서 지금 관심도 급상승 중인 상품 * * *");
        for (int i = 0; i < prices.size(); i++) {
            System.out.println((i+1) + ". " + "[" + brandList[i] + "] " + titleList[i] + "  -->  " + priceList[i]);
        }
    }

}//SSGCrawler

class SsgImg{
    public void crawlImg() throws Exception {
        Document doc = Jsoup.connect("https://www.ssg.com/").get();
        String imageUrl = String.valueOf(doc.select("div.ssgitem_thmb > a > div > img.i1"));
        String destinationFile = "downloaded_image.jpg";

        try {
            downloadImage(imageUrl, destinationFile);
            System.out.println("이미지 다운로드 완료: " + destinationFile);
        } catch (IOException e) {
            System.out.println("이미지 다운로드 실패: " + e.getMessage());
        }
    }

    public static void downloadImage(String imageUrl, String destinationFile) throws IOException {
        try (InputStream in = new URL(imageUrl).openStream()) {
            Files.copy(in, Paths.get(destinationFile));
        }
    }



}
