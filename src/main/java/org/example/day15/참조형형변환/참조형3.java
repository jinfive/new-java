package org.example.day15.참조형형변환;


import javax.swing.*;
import java.util.ArrayList;

public class 참조형3 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JFrame f2 = new JFrame();
        JButton b1 = new JButton();
        JLabel l1 = new JLabel();
        JTextField t1 = new JTextField();
        JTextArea t2 = new JTextArea();
        ArrayList list = new ArrayList();

        f.add(b1);//자동 형변환 Component(부모, 큰) <-- JButton(자식 ,작)
        f.add(l1);
        f.add(t1);
        f.add(t2);
        f.add(f2);
       // f.add(list);//큰 > 작은  관계 가 성립 x  (상속관계 x)
        //==> 참조 형변환은 상속 관계일떄만 가능하다.



    }
}
