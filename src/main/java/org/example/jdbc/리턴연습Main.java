package org.example.jdbc;

import java.sql.Connection;
import java.util.Date;

public class 리턴연습Main {
    public static void main(String[] args) throws Exception {
        리턴연습 test = new 리턴연습();
        int[] arr = test.getArray();
        System.out.println(arr[0] + arr[1]);

        Connection con = test.getConnection("http://www.naver.com", "root", String.valueOf(1234));
        con.setAutoCommit(false);

        Connection con2 = test.getConnection("http://www.naver.com");
        System.out.println(con2.isClosed());

        Date date = test.getDate();
        System.out.println(date.getTime());

        int result = test.getSum(100);
        System.out.println("보너스 추가 금액" + result);

        test.getSum(2000, 3000);

    }
}
