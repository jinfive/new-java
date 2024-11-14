package org.example.jdbc2;

import java.util.Scanner;

public class BoardUpdateUi {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("바꿀 content 입력>> ");
        String contentv = sc.nextLine(); //apple
        System.out.println("바꿀 번호입력");
        int nov = sc.nextInt();
        sc.close();

        //member테이블에 연결해서 입력받은 데이터를 주고 Insert 해달라고 호출하자.
        //memberDAO클래스 사용해서 insert호출
        BoardDao dao = new BoardDao();
        dao.update(contentv,nov);

    }
}
