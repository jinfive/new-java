package org.example.JDBC3.Question;

import java.util.Scanner;

public class DeptUpdateUi {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("업데이트할 지역 입력>> ");
        String locv = sc.next(); //apple
        System.out.println("바꿀 deptno입력");
        int deptnov = sc.nextInt();
        sc.close();

        //member테이블에 연결해서 입력받은 데이터를 주고 Insert 해달라고 호출하자.
        //memberDAO클래스 사용해서 insert호출
        deptDao2 dao = new deptDao2();
        DeptVO vo = new DeptVO();
        vo.setLoc(locv);
        vo.setDeptno(deptnov);
        dao.update(vo);


    }
}
