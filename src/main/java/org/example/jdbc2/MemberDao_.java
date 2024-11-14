package org.example.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MemberDao {
    //DAO클래스는 맴버 테이블에 있는 데이터에 접근해서 여러가지 기능을 정의하는 클래스
    //DB테이블다아 DAO는 하나씩 만든다.
    //테이블 1000개 dao도 1000개 만들어
    public static void main(String[] args) throws Exception {
        //1.드라이버 설정 --> 레이지 로딩(실행시 메모리에 올려줌)
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1.드라이버 설정 완료");

        //2.DB연결
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "";
        Connection con = DriverManager.getConnection(url, id, pw);
        System.out.println("2.DB연결 완료");

        //3.sql준비 --> 객체
        Scanner sc = new Scanner(System.in);
        System.out.print("id 입력>>>");
        String idv = sc.nextLine();
        System.out.print("pw 입력>>>");
        String pwv = sc.nextLine();
        System.out.print("name 입력>>>");
        String namev = sc.nextLine();
        System.out.print("tel 입력>>>");
        String telv = sc.nextLine();
        String sql = "insert into member values (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        //ps가 ? 를 셋팅하는 역할
        ps.setString(1, idv);
        ps.setString(2, pwv);
        ps.setString(3, namev);
        ps.setString(4, telv);
        System.out.println("3.sql준비");
        //4.sql전송
        int res = ps.executeUpdate(); // 실행된 row수 , update,delete
        System.out.println("4.sql전송 성공");
        System.out.println("실행된 row 수 --> " + res );
        //자원해제
        ps.close();
        con.close();
        sc.close();

    }
}
