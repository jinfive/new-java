package org.example.jdbc;


import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test1 {
    public static void main(String[] args) throws Exception {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "1234");
//        PreparedStatement sql = con.prepareStatement("insert into test values (100, 100)");
//        sql.executeUpdate();
        //1.java - mysql db연결하는 라이브러리 설정
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.db dusruf (ip + port --> url,id,pw
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "";
        Connection con = DriverManager.getConnection(url, id, pw);
        //3.sql문 만들어서
        String data1 = JOptionPane.showInputDialog("id입력");
        String data2 = JOptionPane.showInputDialog("name입력");
       // PreparedStatement ps = con.prepareStatement("insert into test values (2,2)");
        PreparedStatement ps = con.prepareStatement("insert into test values (?,?)");
        //1,2 번은 ?의 번호, 1번부터 시작!
        ps.setString(1, data1);
        ps.setString(2, data2);
        //4.mysql로 보내자
        ps.executeUpdate();
        //5.sql실행은 mysql에서 함

        //6.결과를 자바에 보내주면 성공/실패 여부 판단 가능

    }
}
