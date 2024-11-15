package org.example.JDBC3.Question;

import java.util.Scanner;

public class DeptInsertUi {
    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            System.out.print("Deptno입력>> ");
            int deptnov = sc.nextInt(); //apple
            sc.close();

            //member테이블에 연결해서 입력받은 데이터를 주고 Insert 해달라고 호출하자.
        //memberDAO클래스 사용해서 insert호출
      deptDao2 dao = new deptDao2();
      DeptVO bag = dao.one(deptnov);
      String total = bag.getDeptno() + " " + bag.getDeptname() + " "+ bag.getLoc();
        System.out.println(total);




    }
}
