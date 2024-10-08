package org.example.day7.UseClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 로그인화면 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(250,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel top = new JLabel();
        top.setText("일기장");
        Font font =new Font("궁서",Font.BOLD,90);
        top.setFont(font);
        JLabel id = new JLabel();
        Font font2 =new Font("궁서",Font.BOLD,20);
        id.setText("ID");
        JLabel pw = new JLabel();
        pw.setText("Password");
        id.setFont(font2);
        pw.setFont(font2);

        JTextField id2 = new JTextField(10);
        JTextField pw2 = new JTextField(10);

        JButton ok = new JButton();
        ok.setText("OK");
        JButton del = new JButton();
        del.setText("Del");

        ImageIcon icon = new ImageIcon("ok.png");
        ImageIcon icon2 = new ImageIcon("del.png");
        ok.setIcon(icon);
        del.setIcon(icon2);


        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);
        //Jlable 3,JTextField 2 JB 2


        id2.setForeground(Color.BLUE);
        pw2.setForeground(Color.BLUE);

        frame.add(top);
        frame.add(id);
        frame.add(id2);
        frame.add(pw);
        frame.add(pw2);
        frame.add(ok);
        frame.add(del);
        //ok버튼- 아이디 pw가 root 1234가 맞는지?
        //del버튼- 아이디 pw지우기
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //ok버튼을 클릭했을때 처리하는 내용을 넣으세요.
                String id3 = id2.getText();//id2에 입력한 값을 가지고온다
                String pw3 = pw2.getText();//id2에 입력한 값을 가지고온다
                System.out.println(id3 + " " + pw3);
                System.out.println(id3.equals(pw3) + " "+pw3.length());
                if (id3.equals("root") && pw3.equals("1234")) {
                    JOptionPane.showMessageDialog(frame,"로그인 성공");
                }//if
                else if (id3.length()==0 || pw3.length()==0) {
                    JOptionPane.showMessageDialog(frame,"아이디 비밀번호를 입력하세요");
                }
                else {
                    JOptionPane.showMessageDialog(frame,"로그인 실패.");

                }//else
            }//actionPerformed
        });//id2
        del.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                id2.setText("");
                pw2.setText("");

            }
        });//id2


        frame.setVisible(true);
    }
}
