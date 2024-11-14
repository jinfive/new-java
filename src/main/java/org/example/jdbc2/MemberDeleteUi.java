package org.example.jdbc2;

import java.util.Scanner;

public class MemberDeleteUi {
    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            System.out.print("삭제할 id입력>> ");
            String idv = sc.next(); //apple

            sc.close();

            //member테이블에 연결해서 입력받은 데이터를 주고 Insert 해달라고 호출하자.
        //memberDAO클래스 사용해서 insert호출
        MemberDao dao = new MemberDao();
        dao.delete(idv);


    }
}
