package org.example.jdbc4.Question;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDAO {
    Connection con = null;

    public ProductDAO() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("드라이버 연결 성공");
        String url = "jdbc:mysql://127.0.0.1:3306/shop2";
        String user = "root";
        String pw = "";
        con = DriverManager.getConnection(url, user, pw);
        System.out.println("db연결 성공");

    }//생성자 1,2 단계

    public ProductVO one(int productId)throws Exception {
        ProductVO bag = new ProductVO();
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
    public ArrayList<ProductVO> list()throws Exception {
        ArrayList<ProductVO> list = new ArrayList<>();
        String sql = "SELECT * FROM Product";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        ProductVO bag = new ProductVO();
        while(rs.next()) {
            bag.setProductID(rs.getInt("productId"));
            bag.setProductName(rs.getString("ProductName"));
            bag.setPrice(rs.getDouble("price"));
            bag.setQuantity(rs.getInt("quantity"));
            list.add(bag);

        }
        return list;
    }
}
