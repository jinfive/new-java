package org.example.day2.control;

import javax.swing.*;

public class Control1 {
    public static void main(String[] args) {
        String id = "root";
        String pwd = "1234";

        //입력하는 처리 필요
        String id2 = null;      //초기값 bool False int 0  ' ' 널:기본형이 아닌것들 사용.
        String pwd2 = null;

        id2 = JOptionPane.showInputDialog("아이디를 입력하세요"); //"admin","rooot"
        pwd2 =JOptionPane.showInputDialog("비밀번호를 입력하세요");
        System.out.println(id.equals("root") && pwd.equals("1234")); //.equals는 문자열 비교하는 메서드
    }
}