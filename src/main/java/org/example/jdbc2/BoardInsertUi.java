package org.example.jdbc2;

import java.util.Scanner;

public class BoardInsertUi {
    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            System.out.print("no입력>> ");
            int nov = sc.nextInt(); //apple
            System.out.print("title입력>> ");
            String titlev = sc.next(); //1234
            System.out.print("contnet입력>> ");
            String contentv = sc.next(); //apple
            System.out.print("writer입력>> ");
            String writerv = sc.next(); //1111
            sc.close();

            //member테이블에 연결해서 입력받은 데이터를 주고 Insert 해달라고 호출하자.
        //memberDAO클래스 사용해서 insert호출
        BoardDao dao = new BoardDao();
        dao.insert(nov,titlev,contentv,writerv);


    }
}
