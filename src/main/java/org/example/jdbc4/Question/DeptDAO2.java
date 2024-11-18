package org.example.jdbc4.Question;

import java.sql.*;
import java.util.ArrayList;

public class DeptDAO2 {
    Connection con = null;
    public DeptDAO2() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("드라이버 연결 성공");
        String url = "jdbc:mysql://127.0.0.1:3306/shop2";
        String id = "root";
        String pw = "";

        con = DriverManager.getConnection(url,id,pw);
        System.out.println("2.db연결 성공");
    }

    public DeptVO2 one(int deptno) throws Exception {
        DeptVO2 bag = new DeptVO2();
        String sql = "select * from dept where deptno = ?";
        PreparedStatement ps = con.prepareCall(sql);//Java는 sql을 모르기에
        ps.setInt(1,deptno);
        ResultSet rs = ps.executeQuery();//테이블에서 가져와
        if(rs.next()){
            bag.setDeptno(rs.getInt("deptno"));
            bag.setDname(rs.getString("dname"));
            bag.setLoc(rs.getString("loc"));
        }
        return bag;
    }//one

    public ArrayList<DeptVO2> list()throws Exception{
        ArrayList<DeptVO2> list = new ArrayList<>();
        String sql = "select * from dept";
        PreparedStatement ps = con.prepareStatement(sql);
        DeptVO2 bag = new DeptVO2();
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            bag.setDeptno(rs.getInt("deptno"));
            bag.setDname(rs.getString("dname"));
            bag.setLoc(rs.getString("loc"));
            list.add(bag);
        }
        return list;
    }

}
