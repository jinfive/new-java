package org.example.JDBC3.read연습;

import org.example.JDBC3.read연습.MemberVo;

import java.sql.*;

public class MemberDao2 {
    // DAO클래스는 맴버 테이블에 있는 데이터에 접근해서 여러가지 기능을 정의하는 클래스
    // DB테이블마다 DAO는 하나씩 만든다.
    // 테이블 1000개 dao도 1000개 만들어야 한다.
     Connection con;  // static 제거

    public MemberDao2() throws Exception {
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

    public boolean login(MemberVo vo) throws SQLException {
        boolean result = false;//로그인 실패
        String sql = "select id from member\n" +
                "where id = ? and pw = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, vo.getId());
        ps.setString(2, vo.getPw());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            result = true;
        }
        return result;
    }

    //기능 메서드 정의
    public  MemberVo one(String id) throws Exception {
        //1,2단계 DAO객세 생성시 완료
        //3,4 단계만
        //3.sql
        String sql ="select * from member\n" +
                "where id = ? ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);

        ResultSet set = ps.executeQuery();//테이블로 부터 데이터를 받아올때 써
        //결과가 있으면 컬럼의 이름이나 순서로 값을 추출 할 수 있다.
       // System.out.println(set.next());
        //set에 있는 데이터를 꺼내서 vo에 넣어서 ui한테 주자
        //UI로 resultset에 있는 것만 꺼내서 vo에 넣어서 전달 하자
        MemberVo vo = new MemberVo();
        if(set.next()){
            vo.setId(set.getString("id"));//컬럼명선호
            vo.setPw(set.getString(2));
            vo.setName(set.getString("name"));
            vo.setTel(set.getString("tel"));
        }
        return vo;

    }



    public void update(String telv, String idv) throws Exception {
        // 3. SQL 준비 --> 객체 생성
        String sql = "update member set tel = ? where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, telv);
        ps.setString(2, idv);

        System.out.println("3. SQL 준비");

        // 4. SQL 전송
        int res = ps.executeUpdate(); // 실행된 row 수 반환
        System.out.println("4. SQL 전송 성공");
        System.out.println("실행된 row 수 --> " + res);

        // 자원 해제
        ps.close();
    }

    public void delete(String idv) throws Exception {
        // 3. SQL 준비 --> 객체 생성
        String sql = "delete from member where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, idv);

        System.out.println("3. SQL 준비");

        // 4. SQL 전송
        int res = ps.executeUpdate(); // 실행된 row 수 반환
        System.out.println("4. SQL 전송 성공");
        System.out.println("실행된 row 수 --> " + res);

        // 자원 해제
        ps.close();
    }

    public void insert(MemberVo vo) throws Exception {
        // 3. SQL 준비 --> 객체 생성
        String sql = "insert into member values (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, vo.getId());
        ps.setString(2, vo.getPw());
        ps.setString(3, vo.getName());
        ps.setString(4, vo.getTel());

        System.out.println("3. SQL 준비");

        // 4. SQL 전송
        int res = ps.executeUpdate(); // 실행된 row 수 반환
        System.out.println("4. SQL 전송 성공");
        System.out.println("실행된 row 수 --> " + res);

        // 자원 해제
        ps.close();
    }
}