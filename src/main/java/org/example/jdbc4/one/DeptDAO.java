package org.example.jdbc4.one;

import java.sql.*;
import java.util.ArrayList;

public class DeptDAO {

    Connection con = null;
    //jdbc4단계
    public DeptDAO() throws Exception {
        //객체 생성시 1-2 단계를 실행하게 하자
        //crud할 때 모두 동일 하므로!
        //작업을 작성하는 메서드(멤버변수 초기화 같은 작업)
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");
        //2. db연결
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "";
        con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. db연결 성공!");
    }
    //crud 기능별 메서드 추가 하면 끝.
    //각각의 메서드는 3~4단계만 넣어줌
    //read는 (slect 검색,읽기)
    //검색결과가 row 1개,row여거랙 개일때마다 작업이 야각ㄴ 다르다
    //one(int deptno), list()
    public DeptVo one(int deptno) throws SQLException {
        //검색결과가 row개 ---- 가방(Vo)에 컬럼값 다 넣어서 전달
        DeptVo bag = new DeptVo();

        //3단계
        String sql  ="Select * from dept where deptno = ?";
        PreparedStatement ps = con.prepareStatement(sql);//java는 sql을 모르기 때문에
        ps.setInt(1, deptno);

        //4단계
        //테이블 형태로 검색 결과가 와야함.
        ResultSet table = ps.executeQuery(); // 컬럼 + 값들(row)
        if(table.next()){
            //테이블에 값이 있으면 row에 있는 값들을 꺼내서 vo에 넣자.
            //ORM과정
            bag.setDeptno(table.getInt("deptno"));
            bag.setDname(table.getString("dname"));
            bag.setLoc(table.getString("loc"));

        }
        return bag;
    }
    public ArrayList<DeptVo> list(){
        //row하나당 가방 1개 필요
        //row 가 5 개라면 가방 5개 필요
        //ui에 가방 5개 리턴해서 전달하려면 묶어 줘야함.
        //자바에서는 리턴을 할때, 무조건!! 하나로 묶어서 해야함.
        //가방을 묶어줄 용도로 사용하는것이 list 타입의 객체(ArrayList를 사용함)
        ArrayList<DeptVo> list = new ArrayList<>();
        return list;
    }
}
