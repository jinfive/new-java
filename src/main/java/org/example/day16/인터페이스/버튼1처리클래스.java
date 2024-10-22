package org.example.day16.인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//ActionListener는 버튼 클릭시 처리 표준으로 만들어져 있음.

public class 버튼1처리클래스 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("b1을 클릭함.");
    }
}
