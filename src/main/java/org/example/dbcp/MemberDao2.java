package org.example.dbcp;


import org.example.dbcp.MemberVo;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class MemberDao2 {
    // DAO클래스는 맴버 테이블에 있는 데이터에 접근해서 여러가지 기능을 정의하는 클래스
    // DB테이블마다 DAO는 하나씩 만든다.
    // 테이블 1000개 dao도 1000개 만들어야 한다.
    Connection con;  // static 제거
    DBConnectionMgr dbcp;

    public MemberDao2() throws Exception {
        // 싱글톤을 생성된 DBCP객체 획득
        dbcp = DBConnectionMgr.getInstance();
        con = dbcp.getConnection();

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
        dbcp.freeConnection(con, ps);
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
        dbcp.freeConnection(con, ps);
    }

    public void insert(MemberVo vo)
            throws Exception {

        con = dbcp.getConnection();

        //3. sql준비 --> sql객체
        String sql = "insert into member values (?,?,?,?)";

        //insert into member values ('apple',...)
        //ps가 ?를 셋팅하는 역할!
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, vo.getId()); //1은 ?번호
        ps.setString(2, vo.getPw());
        ps.setString(3, vo.getName());
        ps.setString(4, vo.getTel());
        System.out.println("3. sql준비 --> sql객체 성공!");

        //4. sql전송 --> ps가 전송하는 기능을 가지고 있음.
        int result = ps.executeUpdate(); //실행된 row수, update, delete
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");


    }
}