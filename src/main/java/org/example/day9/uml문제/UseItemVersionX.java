package org.example.day9.uml문제;

import java.util.Scanner;

public class UseItemVersionX {
    public static void main(String[] args) {
        Item item1 = new Item();
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
        int[] order = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            System.out.println("메뉴를 주문해 주세요, 주문이 완료되었으면 x 입력");
            System.out.println("\t\t 메뉴판 \t\t");
            System.out.println("=================================================");
            for (int j = 0; j < items.length; j++) {
                System.out.println((j + 1) + ">>" + items[j].getName() + ":" + items[j].getPrice());
            }

            String line = sc.nextLine();
            if (line.equalsIgnoreCase("x")) {
                break;
            }

            order[i] = Integer.parseInt(line);
        }

        System.out.println("주문하신 목록");
        for (int j = 0; j < items.length; j++) {
            if (order[j] != 0) {
                System.out.println((j + 1) + ">>" + items[order[j] - 1].getName() + ":" + items[order[j] - 1].getPrice());
            }
        }

        sc.close();
    }
}