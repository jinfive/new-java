package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB_test {
    public static void main(String[] args) throws Exception {
        //자바 에서 db를 연결하는 프로그램 4단계
        //java db connectivity(JDBC) 4단계
        //1.사용할 라이브러리 설정
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1단계 성공");
        //2.db연결
        String url = "jdbc:mysql://127.0.0.1:3306/shop2";//ip,port,db명
        String username = "root";
        String password = "";

       Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("2단계 shop2 DB연결 성공");

        //3.sql문 작성
        String sql  = "insert into test values(7,'3시다')";
        //4.dbms로 sql문 전송
        PreparedStatement ps = con.prepareStatement(sql);
        ps.executeUpdate();
    }
}
