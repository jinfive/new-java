package org.example.day2.control;

import javax.swing.*;
import java.awt.*;

public class 부품사용1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton();
        JButton b1 = new JButton();

        f.setSize(300,300);
        b1.setText("나도 클릭해줘요");
        b.setText("나를  클릭해줘요");
        b.setBackground(Color.RED);
        b1.setBackground(Color.GREEN);

        b.setForeground(Color.BLUE);
        b1.setForeground(Color.YELLOW);

        Font font = new  Font("궁서",Font.BOLD,20);
        b.setFont(font);
        b1.setFont(font);
        /*
        배치해주는 부품
        물흐르는 것처럼 순서대로 다 붙여주는 레이아웃>FlowLayout

         */
        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);


        f.add(b);
        f.add(b1);

        //맨끝에 사용!
        f.setVisible(true);
    }
}
