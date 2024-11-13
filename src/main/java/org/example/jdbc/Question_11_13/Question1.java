package org.example.jdbc.Question_11_13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Question1 {
    private static java.sql.Connection Connection;

    public static void main(String[] args) throws SQLException {
        /*
        1. 파일명: SchoolDBConnect.java, main()메서드 구현
        a. shop2 db연결하여 성공하면 DB연결 성공, 실패하면 DB연결 실패 출력
        b. 예외처리할 것.
         */
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//드라이버 로드
            //db연결
            String url = "jdbc:mysql://127.0.0.1:3306/shop2";//ip,port,db명
            String username = "root";
            String password = "";

            con = DriverManager.getConnection(url, username, password);
            System.out.println("DB연결 성송");
        } catch (Exception e) {
            System.out.println("드라이버 연결 실패");
            e.printStackTrace();
        }

    /*
    파일명: DeptInsert.java, main()메서드 구현
        a. Scanner를 이용하여 다음의 3개 항목에 대한 데이터를 입력받아 dept테이블에 삽입하는 자바
    프로그래밍을 하시오.
=> DEPTNO : 50, DNAME : MANAGER, LOC : SEOUL
     */
        Scanner sc = new Scanner(System.in);
        System.out.print("deptNO>>");
        String deptNO = sc.nextLine();
        System.out.println();
        System.out.print("deptName>>");
        String deptName = sc.nextLine();
        System.out.println();
        System.out.print("loc>>");
        String loc = sc.nextLine();


        //sql문 작성
        String sql = "insert into dept2 values(?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, deptNO);
        ps.setString(2, deptName);
        ps.setString(3,loc);

        int res = ps.executeUpdate();
        System.out.println("처리된 row 수 "+ res);

        /*
        Scanner를 이용하여 다음의 DEPTNO 데이터를 입력받아 dept테이블에서 삭제하는 자바 프로그래밍을하시오.
        => 조건 DEPTNO : 50
         */
        System.out.println("삭제하실 deptno번호를 입력하세요");
        String deptNo = sc.nextLine();
        String delSql = "delete from dept2 where deptNO=?";
        ps = con.prepareStatement(delSql);
        ps.setString(1, deptNo);
        int del = ps.executeUpdate();
        System.out.println("삭제된 row 수 "+del);

        System.out.println("업데이트할 deptNo를 입력하세요");
        String deptNo2 = sc.nextLine();
        System.out.println("바꿀 LOC를 입력하세요");
        String loc2 = sc.nextLine();
        String updateSql = "update dept2 set loc=? where deptNO=?";
        ps = con.prepareStatement(updateSql);
        ps.setString(1, loc2);
        ps.setString(2, deptNo2);
        int update = ps.executeUpdate();
        System.out.println("업데이트된 행의 수 "+ update);
        con.close();
        sc.close();
        ps.close();
    }
}
