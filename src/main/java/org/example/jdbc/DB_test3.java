package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DB_test3 {
    public static void main(String[] args) throws Exception {
        //db처리만 담당하는 클래스 dao
        //자바 에서 db를 연결하는 프로그램 4단계
        //java db connectivity(JDBC) 4단계
        //1.사용할 라이브러리 설정
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1단계 성공");
        //2.db연결
        String url = "jdbc:mysql://127.0.0.1:3306/shop2";//ip,port,db명
        String username = "root";
        String password = "";

        Connection con=DriverManager.getConnection(url, username, password);
        System.out.println("2단계 shop2 DB연결 성공");
        //입력 받는 부분
        Scanner sc = new Scanner(System.in);

        System.out.print("아이디 입력>> ");
        String id = sc.next();
        System.out.print("이름 입력>> ");
        String name = sc.next();

        sc.close();

        //3.sql문 작성
        String sql  = "insert into test values(?,?)";
        PreparedStatement ps =con.prepareStatement(sql);
        ps.setString(1,id);
        ps.setString(2,name);
        System.out.println("3단계 - sql문 객체화 성공");

        //4.dbms로 sql문 전송
        int result = ps.executeUpdate();
        System.out.println("4단계 처리 성공");
        System.out.println("처리된 row 수 "+result);

    }
}
