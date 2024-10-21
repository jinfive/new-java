package org.example.day14.크롤링;

import javax.swing.*;

public class 증권크롤러Main2 {
    public static void main(String[] args) {
        String code = JOptionPane.showInputDialog("code입력");
        /*
        카카오 035720
        네이버 035420
        현대차 005380
         */
        증권크롤러2 cacao =new 증권크롤러2();
        try {
            String[] data = cacao.crawl(code);
            System.out.println("code가 " + code + "인 회사의 최고가는 " + data[1] + "이고 \n전일가는 " + data[3] + "이다.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
