package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("정보입력 창");
        frame.setSize(560, 540);
        FlowLayout flow = new FlowLayout();
        frame.setLayout(flow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //음식 추가
        JLabel food = new JLabel();
        food.setText("먹고싶은 음식");
        frame.add(food);
        JTextField foodInput = new JTextField(20); // 입력 필드 추가 (너비 20)
        frame.add(foodInput); // 입력 필드 추가
        JButton foodbutton = new JButton();
        foodbutton.setText("뭐먹으러 갈까??");
        foodbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (foodInput.getText().equals("커피")) {
                    JOptionPane.showMessageDialog(frame, "카페로 가세요");
                } else {
                    JOptionPane.showMessageDialog(frame, "물을 마시세요");
                }
            }//익명클래스
        });//클릭이벤트
        frame.add(foodbutton);

        //------------------------------------나이
        JLabel age = new JLabel();
        age.setText("당신의 내년 나이는?");
        frame.add(age);
        JTextField ageInput = new JTextField(20); // 입력 필드 추가 (너비 20)
        frame.add(ageInput); // 입력 필드 추가
        JButton agebutton = new JButton();
        agebutton.setText("당신의 내년 나이는?");
        foodbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String age = ageInput.getText();
                int ageInt = Integer.parseInt(age);
                JOptionPane.showMessageDialog(frame, ageInt + 1);
            }//익명클래스
        });//클릭이벤트

        frame.add(agebutton);
        frame.setVisible(true);
    }
}
