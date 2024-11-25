package org.example.swingUI;

import javax.swing.*;
import java.awt.*;

public class MemberUI extends JFrame {
    JLabel top,l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3;
   MemberUI(){
       setTitle("Member UI");
       setSize(400, 300);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new FlowLayout());

       top = new JLabel("Member");
       l1 = new JLabel("아이디");
       l2 = new JLabel("패스워드");
       l3 = new JLabel("이름");
       l4 = new JLabel("전화번호");

       t1 = new JTextField(10);
       t2 = new JTextField(10);
       t3 = new JTextField(10);
       t4 = new JTextField(10);

       b1 = new JButton("회원가입");
       b2 = new JButton("회원탈퇴");
       b3 = new JButton("회원정보");

       top.setFont(new Font("궁서", Font.BOLD, 50));
       Font font = new Font("굴림", Font.BOLD, 30);
       l1.setFont(font);
       l2.setFont(font);
       l3.setFont(font);
       l4.setFont(font);
       t1.setFont(font);
       t2.setFont(font);
       t3.setFont(font);
       t4.setFont(font);
       b1.setFont(font);
       b2.setFont(font);
       b3.setFont(font);
       add(top);
       add(l1);
       add(l2);
       add(l3);
       add(l4);
       add(t1);
       add(t2);
       add(t3);
       add(t4);
       add(b1);
       add(b2);
       add(b3);

       getContentPane().setBackground(Color.GREEN);



       setVisible(true);
   }
   public static void main(String[] args) {
       new MemberUI();
   }
}
