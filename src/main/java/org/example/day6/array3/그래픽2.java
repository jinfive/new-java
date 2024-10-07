package org.example.day6.array3;

import javax.swing.*;

public class 그래픽2 {
    public static void main(String[] args) {
       JFrame f = new JFrame();
        f.setSize(300,300);
       f.setTitle("그래픽 연습");
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       JButton button = new JButton();
       button.setText("버튼입니다.");

       f.add(button);
       f.setVisible(true);
    }//main
}//class
