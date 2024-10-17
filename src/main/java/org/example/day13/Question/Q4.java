package org.example.day13.Question;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q4 extends JFrame {
    static int count = 0;
    public Q4()  {
        setTitle("Button Click Counter");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //레이아웃
        FlowLayout flowLayout = new FlowLayout();
        setLayout(flowLayout);

        //폰트
        Font font =new Font("Times New Roman",Font.BOLD,20);
        JLabel label =new JLabel("Button click"+count+"times");
        JButton button1 = new JButton("Click Me");
        button1.setForeground(Color.RED);
        button1.setFont(font);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("Button clicked " + count + " times");
            }
        });

        add(label);
        add(button1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
