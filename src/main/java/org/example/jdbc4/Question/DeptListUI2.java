package org.example.jdbc4.Question;

import java.util.ArrayList;

public class DeptListUI2 {
    public static void main(String[] args)throws Exception {
        DeptDAO2 dao2 = new DeptDAO2();
        ArrayList<DeptVO2>list = dao2.list();
        for(DeptVO2 deptVO2 : list){
            System.out.println(deptVO2);
        }

    }
}
