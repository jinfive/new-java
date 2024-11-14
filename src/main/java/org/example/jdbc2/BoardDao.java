package org.example.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BoardDao {
    // DAO클래스는 맴버 테이블에 있는 데이터에 접근해서 여러가지 기능을 정의하는 클래스
    // DB테이블마다 DAO는 하나씩 만든다.
    // 테이블 1000개 dao도 1000개 만들어야 한다.
     Connection con;  // static 제거

    public BoardDao() throws Exception {
        // 1. 드라이버 설정 --> 레이지 로딩(실행 시 메모리에 올려줌)
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 완료");

        // 2. DB 연결
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "";
        con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. DB 연결 완료");
    }

    public void insert(int nov, String titlev, String contentv, String writerv) throws Exception {
        // 3. SQL 준비 --> 객체 생성
        String sql = "insert into board values (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, nov);
        ps.setString(2, titlev);
        ps.setString(3, contentv);
        ps.setString(4, writerv);

        System.out.println("3. SQL 준비");

        // 4. SQL 전송
        int res = ps.executeUpdate(); // 실행된 row 수 반환
        System.out.println("4. SQL 전송 성공");
        System.out.println("실행된 row 수 --> " + res);

        // 자원 해제
        ps.close();
    }
    public void update(String contentv,int nov) throws Exception {
        // 3. SQL 준비 --> 객체 생성
        String sql = "update board set content = ? where no = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(2, nov);
        ps.setString(1, contentv);


        System.out.println("3. SQL 준비");

        // 4. SQL 전송
        int res = ps.executeUpdate(); // 실행된 row 수 반환
        System.out.println("4. SQL 전송 성공");
        System.out.println("실행된 row 수 --> " + res);

        // 자원 해제
        ps.close();
    }
}