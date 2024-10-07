package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;

public class 영화순위 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextField jTextField = new JTextField();
        frame.setTitle("2024년10월 박스오피스순위");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 400);
        //데이터 준비 -->배열(같은속성,같은타입,많을 때 사용)
        String[] title ={"베테랑2","대도시의사랑","와일드카봇","조커","트랜스포머"};
        String[] img ={"베테랑2.jpeg","대도시의사랑.jpeg","와일드로봇.jpeg","조커.jpeg","트랜스포머.jpeg"};
        double[] jumsu = {9.9,8.8,7.7,6.6,5.5};

        //텍스트 3개 들어갈 자리(위,아래,포스터 이미지)
        JLabel top = new JLabel();
        top.setText(title[2]);

        JLabel bottom = new JLabel();
        bottom.setText(String.valueOf(jumsu[2]));//String > double ==> String.valueOf사용.

        JLabel  center= new JLabel();
        //center.setText("이미지");
        ImageIcon icon = new ImageIcon(img[2]);
        center.setIcon(icon);

        JButton left = new JButton();
        left.setText("<<");

        JButton right = new JButton();
        right.setText(">>");

        Font font = new Font("궁서", Font.BOLD, 25);
        top.setFont(font);
        bottom.setFont(font);
        center.setFont(font);
        left.setFont(font);
        right.setFont(font);

        frame.add(top, BorderLayout.NORTH);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.add(center, BorderLayout.CENTER);
        frame.add(left, BorderLayout.WEST);
        frame.add(right, BorderLayout.EAST);



        //맨 끝!
        frame.setVisible(true);
    }
}
