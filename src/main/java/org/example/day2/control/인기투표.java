package org.example.day2.control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 인기투표 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(700, 500);
        f.setTitle("인기투표");

        Font font = new Font("궁서", Font.BOLD, 20);
        FlowLayout flowLayout = new FlowLayout();
        f.setLayout(flowLayout);

        JButton b1 = new JButton();
       // b1.setText("아이유");

        JButton b2 = new JButton();
       // b2.setText("프로미스나인");

        JButton b3 = new JButton();
        //b3.setText("스테이시");

        //라벨생성
        JLabel l1 = new JLabel();
        l1.setText("인기투표 시스템");
        l1.setFont(font);

        JLabel l2 = new JLabel();
        l2.setText("아이유");
        l2.setFont(font);


        JLabel l3 = new JLabel();
        l3.setText("프로미스나인");
        l3.setFont(font);

        JLabel l4 = new JLabel();
        l4.setText("스테이시");
        l4.setFont(font);
        Image icon1 = new ImageIcon("001.png").getImage();
        b1.setIcon(new ImageIcon(icon1));

        Image icon2 = new ImageIcon("002.png").getImage();
        b2.setIcon(new ImageIcon(icon2));

        Image icon3 = new ImageIcon("003.png").getImage();
        b3.setIcon(new ImageIcon(icon3));

        f.add(l1);
        f.add(b1);
        f.add(l2);
        f.add(b2);
        f.add(l3);
        f.add(b3);
        f.add(l4);

        b1.addActionListener(new ActionListener() {
            int iu =0;
            public void actionPerformed(ActionEvent e) {
                //b1이 클릭되면 자동으로 실행되는 코드임.
                iu +=1; //iu++;  이건 단항 연산자
                l2.setText("아이유>> "+ iu);
                System.out.println("버튼1 클림됨");
            }
        });

        b2.addActionListener(new ActionListener() {
            int promiss = 0;
            public void actionPerformed(ActionEvent e) {
                promiss +=1;
                l3.setText("프로미스나인>>" + promiss);
                System.out.println("버튼2 클림됨");
            }
        });

        b3.addActionListener(new ActionListener() {
            int stacy = 0;
            public void actionPerformed(ActionEvent e) {
                stacy +=1;
                l4.setText("스테이시>>"+stacy);
                System.out.println("버튼3 클림됨");
            }
        });

        f.setVisible(true);
    }
}
