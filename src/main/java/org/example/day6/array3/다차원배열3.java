package org.example.day6.array3;

import javax.swing.*;

public class 다차원배열3 {
    public static void main(String[] args) {
        //전체 프레임이 필요
        //new를 이용해서 부품을 만들어 램에 넣어줌.

        JFrame f = new JFrame();
        f.setSize(500, 500);
        String[] title = {"장소", "누구와", "언제"};
        String[][] contents = {
                {"광주","혼자","수요일"},
                {"오사카","여자친구","금요일"},
                {"파주","가족","토요일"}
        };
        JTable table = new JTable(contents, title);
        //JTable table = new JTable(2차원DATA, 1차원 DATA);
        JScrollPane scrollPane = new JScrollPane(table);//스크럴 추가
        f.add(scrollPane);//조립
        //맨 끝에!
        f.setVisible(true);//보이는 것 설명
    }//main
}//class
