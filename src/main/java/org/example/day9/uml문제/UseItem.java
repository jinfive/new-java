package org.example.day9.uml문제;

import java.util.Scanner;

public class UseItem {
    public static <string> void main(String[] args) {
        Item item1 = new Item();//변수 3개 속성2 item1
        item1.name = "햄버거";
        item1.price = 5.99;
        Item item2 = new Item();
        item2.name = "감튀";
        item2.price = 2.99;
        Item item3 = new Item();
        item3.name = "콜라";
        item3.price = 1.99;
        Item[] items = {item1, item2, item3};
        Scanner sc = new Scanner(System.in);

        System.out.println("메뉴3개를 주문해 주세요,주문이 완료 됬으면 x 입력");
        System.out.println("\t\t 메뉴판 \t\t");
        System.out.println("=================================================");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ">>" + items[i].getName() + ":" + items[i].getPrice());
        }//for
        String n = sc.nextLine();//입력 예 1 2 3
        String[] s =n.split(" ");//{"1" ,"2" ,"3'}

        System.out.println("주문 내역입니다.");
        int[] s2 = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            s2[i] = Integer.parseInt(s[i]);
            System.out.println(items[s2[i] - 1].getName()+" "+items[s2[i]-1].getPrice());
        }//for

//        int s2 = Integer.parseInt(s[0]);
//        System.out.println(items[s2 - 1].getName());

        sc.close();
//        System.out.println("1>>"+item1.getName()+":" +item1.getPrice());
//        System.out.println("2>>"+item2.getName()+":" +item2.getPrice());
//        System.out.println("3>>"+item3.getName()+":" +item3.getPrice());
//

//        while (true){
//            System.out.println("메뉴3개를 주문해 주세요,주문이 완료 됬으면 x 입력");
//            System.out.println("\t\t 메뉴판 \t\t");
//            System.out.println("=================================================");
////            System.out.println("1>>"+item1.getName()+":" +item1.getPrice());
////            System.out.println("2>> 감튀: $2.99");
////            System.out.println("3>> 콜라: $1.99");
//            Scanner sc = new Scanner(System.in);
//            String input = sc.nextLine();
//            if(input.equals("x")){
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            }//if
//            else{
//
//            }//else
//        }//while

    }//mian
}//class
