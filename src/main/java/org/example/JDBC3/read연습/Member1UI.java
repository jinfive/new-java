package org.example.JDBC3.read연습;

import org.example.JDBC3.vo연습.Bag;
import org.example.JDBC3.vo연습.받는DAO;

import javax.swing.*;
import java.util.Scanner;

public class Member1UI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디 입력>>>>>>");
        String name = sc.nextLine();
        sc.close();

      MemberDao2 dao2 = new MemberDao2();
      MemberVo bag = dao2.one(name); //membervo가 리턴
      String total = bag.getId() +" " + bag.getPw() + bag.getName() + " " + bag.getTel();
        JOptionPane.showMessageDialog(null, total);
      dao2.one(name);
    }
}
