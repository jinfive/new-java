package org.example.JDBC3.Question;

import java.sql.*;

public class deptDao2 {
    // DAO클래스는 맴버 테이블에 있는 데이터에 접근해서 여러가지 기능을 정의하는 클래스
    // DB테이블마다 DAO는 하나씩 만든다.
    // 테이블 1000개 dao도 1000개 만들어야 한다.
     Connection con;  // static 제거

    public deptDao2() throws Exception {
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
    //검색 메서드 정의
    public DeptVO one(int deptno) throws SQLException {
        String sql ="select * from dept2\n" +
                "where deptno = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, deptno);
        ResultSet rs = ps.executeQuery();//테이블로 부터 데이터를 받아올때 사용
        DeptVO VO = new DeptVO();
        if(rs.next()){
            VO.setDeptno(rs.getInt("deptno"));
            VO.setDeptname(rs.getString("dname"));
            VO.setLoc(rs.getString("loc"));
        }
        return VO;
    }

    public void update(DeptVO vo) throws Exception {
        // 3. SQL 준비 --> 객체 생성
        String sql = "update dept2 set loc = ? where deptno = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, vo.getLoc());
        ps.setInt(2, vo.getDeptno());

        System.out.println("3. SQL 준비");

        // 4. SQL 전송
        int res = ps.executeUpdate(); // 실행된 row 수 반환
        System.out.println("4. SQL 전송 성공");
        System.out.println("실행된 row 수 --> " + res);

        // 자원 해제
        ps.close();
    }

    public void delete(DeptVO vo) throws Exception {
        // 3. SQL 준비 --> 객체 생성
        String sql = "delete from dept2 where deptno = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, vo.getDeptno());
        System.out.println("3. SQL 준비");

        // 4. SQL 전송
        int res = ps.executeUpdate(); // 실행된 row 수 반환
        System.out.println("4. SQL 전송 성공");
        System.out.println("실행된 row 수 --> " + res);

        // 자원 해제
        ps.close();
    }
    

    public void insert(DeptVO vo) throws Exception {
        // 3. SQL 준비 --> 객체 생성
        String sql = "insert into dept2 values (?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,vo.getDeptno());
        ps.setString(2, vo.getDeptname());
        ps.setString(3, vo.getLoc());


        System.out.println("3. SQL 준비");

        // 4. SQL 전송
        int res = ps.executeUpdate(); // 실행된 row 수 반환
        System.out.println("4. SQL 전송 성공");
        System.out.println("실행된 row 수 --> " + res);

        // 자원 해제
        ps.close();
    }
}