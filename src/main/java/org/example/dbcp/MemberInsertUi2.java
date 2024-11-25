package org.example.dbcp;

import org.example.jdbc2.MemberDao2;
import org.example.jdbc2.MemberVo;

import java.util.Scanner;

public class MemberInsertUi2 {
    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            System.out.print("id입력>> ");
            String idv = sc.next(); //apple
            System.out.print("pw입력>> ");
            String pwv = sc.next(); //1234
            System.out.print("name입력>> ");
            String namev = sc.next(); //apple
            System.out.print("tel입력>> ");
            String telv = sc.next(); //1111
            sc.close();

            //member테이블에 연결해서 입력받은 데이터를 주고 Insert 해달라고 호출하자.
        //memberDAO클래스 사용해서 insert호출
        org.example.jdbc2.MemberDao2 dao = new MemberDao2();
        MemberVo vo = new MemberVo();
        vo.setId(idv);
        vo.setPw(pwv);
        vo.setName(namev);
        vo.setTel(telv);
        dao.insert(vo);


    }
}
