package org.example.JDBC3.read연습;

import javax.swing.*;
import java.util.Scanner;

public class MemberloginUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디 입력>>>>>>");
        String id = sc.nextLine();
        System.out.print("비밀번호 입력>>>>>>");
        String pw = sc.nextLine();
        sc.close();

        MemberDao2 dao = new MemberDao2();
        //vo 쓰는 기준!!
        //가방 만들고 값 넣고 전달하고
        MemberVo bag = new MemberVo();
        bag.setId(id);
        bag.setPw(pw);

        //결과 출력 Ui에 해야함.
        System.out.println(dao.login(bag));

    }
}
