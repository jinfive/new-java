package org.example.day14.크롤링;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링테스트2 {
    public static void main(String[] args) throws Exception {
        Document doc2 = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930#").get();
        doc2.select("span.code");//0~ 여러개
        doc2.select("span.tx");//0~ 여러개
        //<span class ="code">이름</span>찾아줌 :Element,tag

        Elements list = doc2.select("span.code");
        Elements list1 = doc2.select("span.tx");
        Elements list2 = doc2.select("div.today span.blind");
        Elements list3 = doc2.select("td.first");

        Elements list4 = doc2.select("span.blind");
        Elements list5 = doc2.select("a");
        for (int i = 0; i < list5.size(); i++) {
            System.out.println(i+">>>"+list5.get(i).text());

        }


        for (int i = 0; i < list4.size(); i++) {
            System.out.println(i + ": "+list4.get(i));
        }

        //Question
        String high = list4.get(19).text();// 고가 high에 넣기
        String today = list4.get(22).text();//현재가 today 넣기
        String yeasterday = list4.get(17).text();//전일가 yeasterday넣기
        String name = list5.get(13).text();
        System.out.println("회사명>>>"+name);
        System.out.println("현재가 >>"+ today);
        System.out.println("전일가 >>"+ yeasterday);
        System.out.println("고가>>>"+ high);


        /*
        <div class="today">
         <p class="no_today"><em class="no_down"> <span class="blind">59,400</span> <span class="no5">5</span><span class="no9">9</span><span class="shim">,</span><span class="no4">4</span><span class="no0">0</span><span class="no0">0</span> </em></p>
         <p class="no_exday"><span class="sptxt sp_txt1">전일대비</span> <em class="no_down"> <span class="ico down">하락</span> <span class="blind">300</span> <span class="no3">3</span><span class="no0">0</span><span class="no0">0</span> </em> <span class="bar">l</span> <em class="no_down"> <span class="ico minus">-</span> <span class="blind">0.50</span> <span class="no0">0</span><span class="jum">.</span><span class="no5">5</span><span class="no0">0</span> <span class="per">%</span> </em></p>
        </div>
         */
//        System.out.println(list.size());
//        System.out.println(list);
//        System.out.println(list1);
//        System.out.println(list2);
        System.out.println(list3);

        Element e1 = list.get(0);
        Element e2 = list1.get(0);
        Element e3 = list2.get(0);



        String code = e1.text();
        String code1 = e2.text();
        String code2 = e3.text();

        System.out.println(code);
        System.out.println(code1);
        System.out.println(code2);
//        for(int i = 0 ; i < list1.size();i++){
//            System.out.println(list1.get(i).text());
//        }
    }
}
