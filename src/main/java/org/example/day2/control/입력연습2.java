package org.example.day2.control;

import javax.swing.*;
import java.util.Scanner;

public class 입력연습2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력>>>");
        int a = sc.nextInt();
        System.out.print("두번째 숫자 입력>>>");
        int b = sc.nextInt();

        System.out.println(a>b);
        sc.close();

        // int a1 = JOptionPane.showConfirmDialog("숫자를 입룍");

    }
}
