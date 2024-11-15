package org.example.JDBC3.vo연습;

import java.util.Scanner;

public class 보내는UI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름입력>>>>>>");
        String name = sc.nextLine();
        System.out.print("나이입력>>>>>>");
        int age = sc.nextInt();
        System.out.print("취미입력>>>>>>");
        String hobby = sc.nextLine();
        System.out.print("전화번호 입력>>>>>>");
        String tel = sc.nextLine();
        sc.close();

        //가방을 만들어서
        Bag bag = new Bag();
        //값을 넣고
        bag.setName(name);
        bag.setAge(age);
        bag.setHobby(hobby);
        bag.setAge(age);
        //전달 하자
        //이삐게 프린트 하고 싶은경우 프린트 클래스 찾자
        받는DAO dao = new 받는DAO();
        dao.print(bag);
    }
}
