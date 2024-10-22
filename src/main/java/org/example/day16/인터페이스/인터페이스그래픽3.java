package org.example.day16.인터페이스;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//제일 많이 사용.
public class 인터페이스그래픽3  {
    static TextArea list;
    static JButton b1, b2;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setLayout(new FlowLayout());
        b1 = new JButton("나를 눌러요.");
        b2 = new JButton("나도 눌러요.");
        f.add(b1);
        f.add(b2);
        Font font = new Font("궁서", Font.BOLD, 50);
        b1.setFont(font);
        b2.setFont(font);
        버튼1처리클래스 버튼1처리 = new 버튼1처리클래스();
        b1.addActionListener(버튼1처리);
        버튼2처리클래스 버튼2처리 = new 버튼2처리클래스();
        b2.addActionListener(버튼2처리);
        list = new TextArea(6, 13);
        list.setFont(font);
        f.add(list);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.append("b1클릭");
            }
        });//익명 클래스


        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.append("b2클릭");
            }
        });//익명 클래스

        //맨마지막
        f.setVisible(true);
    }
}
