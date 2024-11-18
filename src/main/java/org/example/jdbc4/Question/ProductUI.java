package org.example.jdbc4.Question;

import java.util.Scanner;

public class ProductUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요>>>");
        int n = sc.nextInt();
        ProductDAO dao = new ProductDAO();
        ProductVO bag = dao.one(n);
        sc.close();
        System.out.println(bag);

    }
}
