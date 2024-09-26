package org.example.day2.control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicQ1Gui {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 700);

        Font font = new Font("궁서", Font.BOLD, 20);

        f.setFont(font);
        f.setTitle("numbergame");

        FlowLayout flowLayout = new FlowLayout();
        f.setLayout(flowLayout);

        JLabel l1 = new JLabel();
        l1.setText("게임을 계속 하시겠습니까??");
        l1.setFont(font);

        JButton b1 = new JButton();
        b1.setText("계속 하시겠습까?");
        b1.setFont(font);
        b1.setForeground(Color.BLUE);


        JButton b2 = new JButton();
        b2.setText("그만 하시겠습니까??");
        b2.setFont(font);
        b2.setForeground(Color.RED);


        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //b1이 클릭되면 자동으로 실행되는 코드임.
                int  a = Integer.parseInt(JOptionPane.showInputDialog("처음 정수 입력"));
                int  b = Integer.parseInt(JOptionPane.showInputDialog("둘 번째 정수 입력"));
                if(a > b){
                    JOptionPane.showInternalMessageDialog(null,"첫번째 사람 승리");
                } else if (a < b) {
                    JOptionPane.showInternalMessageDialog(null,"두번째 사람 승리");
                }
                else
                    JOptionPane.showInternalMessageDialog(null,"비겼습니다.");
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        f.add(l1);
        f.add(b1);
        f.add(b2);

        f.setVisible(true);
    }
}
