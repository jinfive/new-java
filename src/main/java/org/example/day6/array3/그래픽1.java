package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;

public class 그래픽1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 500); // 프레임 크기 설정
        f.setTitle("그래픽 연습");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x를 누르면 종료 시 프로그램 종료


        JButton button = new JButton();//버튼1
        button.setText("나를 눌러주세요");//함수, 메서드, 명령어는 명령어(입력 데이터)

        JButton button2 = new JButton();//버튼2
        button2.setText("@@@@@@");


        f.add(button, BorderLayout.NORTH);//프레임 위에 얹어
        f.add(button2, BorderLayout.CENTER);//프레임 위에 얹어

        f.setVisible(true); // 프레임 보이기
    }
}
