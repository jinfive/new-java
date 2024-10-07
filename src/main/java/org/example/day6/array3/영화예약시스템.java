package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 영화예약시스템 {
    static int count = 0;
    static  String sum = " ";//좌석 번호 누적용.

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(560, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < 100; i++) {
            JButton button = new JButton();
            button.setText((i + 1) + " ");
            FlowLayout flow = new FlowLayout();
            frame.setLayout(flow);
            frame.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //버튼 눌렀을떄 실행되는 내용
                    //버튼 클릭하면 ActionListener내부의 actionPerformed 실행
                    String s = e.getActionCommand();//버튼위 글자를 가져온다.
                    System.out.println(s);
                    JOptionPane.showMessageDialog(frame, s + "번 예매완료");
                    count++;
                    sum = sum + s+ " 번";
                    button.setEnabled(false);

                }
            });//addActionListener
        }//for
        JButton reset = new JButton();
        reset.setText("결재 하기");
        frame.add(reset);
        reset.setForeground(Color.RED);

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "총결재 금액" + (count * 10000)+"\n예매한 자리 "+ sum);
            }//익명클래스
        });//클릭이벤트

        frame.setVisible(true);
    }
}
