package org.example.day14.크롤링;

import javax.swing.*;

public class 증권크롤러Main {
    public static void main(String[] args) {
        String code = JOptionPane.showInputDialog("code입력");
        /*
        카카오 035720
        네이버 035420
        현대차 005380
         */
        증권크롤러1 cacao =new 증권크롤러1();
        try {
            String data  = cacao.crawl(code);
            JOptionPane.showMessageDialog(null,data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
