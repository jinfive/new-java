package org.example.jdbc4.Question;

import org.apache.commons.math3.stat.descriptive.summary.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductListUI {
    public static void main(String[] args) throws Exception {

        ProductDAO dao = new ProductDAO();
        ArrayList<ProductVO> list = dao.list();
        for (ProductVO bag : list) {
            System.out.println(bag);
        }




    }
}
