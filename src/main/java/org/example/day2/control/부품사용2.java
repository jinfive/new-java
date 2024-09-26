package org.example.day2.control;

import javax.swing.*;
import java.awt.*;

public class 부품사용2 {
    public static void main(String[] args) {
        //JFrame을 만들음
        JFrame frame = new JFrame(); //frame 에는 주소가 들어있다.
        JButton button = new JButton();
        frame.setSize(300, 300); //사이즈 지정
        frame.setTitle("부품 사용 방법");

        button.setText("버튼");
        frame.add(button);

        button.setForeground(Color.RED); //버튼 글씨 색 지정
        button.setBackground(Color.GREEN); //버튼 바탕색 지정

        Font font = new  Font("궁서",Font.BOLD,20);
        button.setFont(font);

        FlowLayout flowLayout = new FlowLayout(); //레이아웃 보기위해
        frame.setLayout(flowLayout);

        frame.setVisible(true);
    }
}
