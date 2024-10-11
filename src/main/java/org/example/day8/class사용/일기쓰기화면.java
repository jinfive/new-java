package org.example.day8.class사용;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class 일기쓰기화면 {
    public  void open() {
        JFrame frame = new JFrame();
        frame.setSize(300,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("나의 일기장");
        Font font = new Font("궁서",Font.BOLD,20);
//오늘의 날짜
        JLabel dateLable = new JLabel();
        dateLable.setText("오늘의 날짜");
        dateLable.setFont(font);

        JTextField dateText = new JTextField(10);

//오늘의 요일
        JLabel dayLable = new JLabel();
        dayLable.setText("오늘의 요일");
        dayLable.setFont(font);

        JTextField dayText = new JTextField(10);



//오늘의 내용
        JLabel contentLable = new JLabel();
        contentLable.setText("오늘의 내용");
        contentLable.setFont(font);

        JTextArea contentTextAray = new JTextArea(4,10);

//save 버튼
        JButton save = new JButton();
        save.setText("파일에 일기 저장");
        save.setFont(font);
        save.setForeground(Color.RED);
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String date = dateText.getText();
                String day = dayText.getText();
                String content = contentTextAray.getText();
                JOptionPane.showMessageDialog(frame, date+"\n"+day+"\n"+content);

                //파일을 만들어 보자
                try {
                    FileWriter file = new FileWriter(date+".txt");
                    file.write(date);
                    file.write("\n");
                    file.write(day);
                    file.write("\n");
                    file.write(content);
                    file.write("\n");
                    file.close();
                } catch (IOException ex) {
                    System.out.println("파일과 관련된 문제가 생겼습니다.");
                }
            }
        });


        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);
        frame.add(dateLable);
        frame.add(dateText);
        frame.add(dayLable);
        frame.add(dayText);
        frame.add(contentLable);
        frame.add(contentTextAray);
        frame.add(save);
        //마지막
        frame.setVisible(true);
    }
}
