package org.example.day16.인터페이스;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;

public class 글자길이판독기 {
    static JTextArea area;
    static JButton b1, b2, b3;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JLabel label = new JLabel();
        label.setText("문장을 넣으세여");
        f.setSize(700, 700);
        f.getContentPane().setBackground(Color.green);
        f.setLayout(new FlowLayout());
        b1 = new JButton("글자수/단어분석");
        b2 = new JButton("색 변경.");
        b3 = new JButton("글자 색변경.");
        area = new JTextArea(3, 10);
        area.setBackground(Color.yellow);
        area.setLineWrap(true);
        area.setAutoscrolls(true);


        Font font = new Font("궁서", Font.BOLD, 50);

        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);
        label.setFont(font);
        area.setFont(font);

        f.add(label);
        f.add(area);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //area에 쓴 글자들을 가지고옴
                String data =area.getText();
                //글자수와 단어수를 파악
                int length = data.replace(" ","").length();
                String[] data2 =data.split(" ");
                int count = data2.length;
                //다이얼로그창에 결과를 띄우자!
                JOptionPane.showMessageDialog(f,"단어수"+count +"\n 글자수는" +
                        +length );

            }
        });

        //맨마지막

        f.setVisible(true);
    }//main
}//class
