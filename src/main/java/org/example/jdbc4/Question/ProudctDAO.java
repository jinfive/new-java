package org.example.jdbc4.Question;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProudctDAO {
    Connection con = null;

    public ProudctDAO() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("드라이버 연결 성공");
        String url = "jdbc:mysql://127.0.0.1:3306/shop2";
        String user = "root";
        String pw = "";
        con = DriverManager.getConnection(url, user, pw);
        System.out.println("db연결 성공");

    }//생성자 1,2 단계

    public ProudctVO one(int productId)throws Exception {
        ProudctVO bag = new ProudctVO();
        String sql = "SELECT * FROM Product WHERE productId = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, productId);
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            bag.setProductID(rs.getInt("productId"));
            bag.setProductName(rs.getString("ProductName"));
            bag.setPrice(rs.getDouble("price"));
            bag.setQuantity(rs.getInt("quantity"));
        }
        return bag;
    }
}
