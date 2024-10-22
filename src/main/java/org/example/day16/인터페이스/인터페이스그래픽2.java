package org.example.day16.인터페이스;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 인터페이스그래픽2 implements ActionListener {
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

        인터페이스그래픽2 action = new 인터페이스그래픽2();
        b1.addActionListener(action);//버튼이 클릭되면, actionPerformed 메서드가 호출되고
        b2.addActionListener(action);


        //맨마지막
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            list.append("b1클릭함.\n");
        }//if
        if (e.getSource() == b2) {
            list.append("b2클릭함.\n");
        }
    }//메서드
}
