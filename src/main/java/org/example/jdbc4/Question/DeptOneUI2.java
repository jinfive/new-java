package org.example.jdbc4.Question;

import java.util.Scanner;

public class DeptOneUI2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("검색하실 번호를 알려주세요>>>>");
        int n = scanner.nextInt();
        DeptDAO2 dao = new DeptDAO2();
        DeptVO2 bag = dao.one(n);
        if(bag != null){
            System.out.println(bag);
        }



    }
}
