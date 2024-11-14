package org.exa0mple.jdbc2;

import org.example.jdbc2.MemberDao;

import java.util.Scanner;

public class MemberUpdateUi {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("업데이트할 전화 번호 입력>> ");
        String telv = sc.next(); //apple
        System.out.println("바꿀 id입력");
        String idv = sc.next();
        sc.close();

        //member테이블에 연결해서 입력받은 데이터를 주고 Insert 해달라고 호출하자.
        //memberDAO클래스 사용해서 insert호출
        MemberDao dao = new MemberDao();
        dao.update(telv,idv);


    }
}
