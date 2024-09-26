package org.example.day2.control;

import javax.swing.*;
import java.awt.*;

public class 부품사용2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton();
        frame.setSize(300, 300);

        button.setText("버튼");
        frame.add(button);

        button.setForeground(Color.RED);
        button.setBackground(Color.GREEN);

        Font font = new  Font("궁서",Font.BOLD,20);
        button.setFont(font);

        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        frame.setVisible(true);
    }
}
