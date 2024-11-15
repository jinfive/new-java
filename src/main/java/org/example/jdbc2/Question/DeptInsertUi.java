package org.example.jdbc2.Question;

import org.example.jdbc2.MemberDao;

import java.util.Scanner;

public class DeptInsertUi {
    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            System.out.print("Deptno입력>> ");
            int deptnov = sc.nextInt(); //apple
            System.out.print("Dname입력>> ");
            String dnamev = sc.next(); //1234
            System.out.print("LOC입력>> ");
            String locv = sc.next(); //apple
            sc.close();

            //member테이블에 연결해서 입력받은 데이터를 주고 Insert 해달라고 호출하자.
        //memberDAO클래스 사용해서 insert호출
      deptDao2 dao = new deptDao2();
      DeptVO vo = new DeptVO();
      vo.setDeptno(deptnov);
      vo.setDeptname(dnamev);
      vo.setLoc(locv);
      dao.insert(vo);


    }
}
