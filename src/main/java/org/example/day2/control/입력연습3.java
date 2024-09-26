package org.example.day2.control;

import java.util.Scanner;

public class 입력연습3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("나의 이름은?");
        String name = sc.next();
        System.out.print("나의 키는?");
        Double height = sc.nextDouble();
        System.out.print("나의 몸무게는?");
        Double weight = sc.nextDouble();
        System.out.print("저녁식사 여부는?");
        boolean dinner = sc.nextBoolean();
        sc.nextLine(); // 위에서 사용한 엔터를 처리한다.
        System.out.print("나의 좌우명은?");
        String dream = sc.nextLine();

        System.out.println("내 이름은 " + name + "입니다");
        System.out.println("내 내년 키는  " + height + "입니다");
        System.out.println("내 내년 몸무게는 " + weight + "입니다");
        System.out.println("나는 저녁은  " + dinner + "했습니다");
        System.out.println("나의 좌우명은 " + dream + "입니다,");


        sc.close();

        // int a1 = JOptionPane.showConfirmDialog("숫자를 입룍");

    }
}
