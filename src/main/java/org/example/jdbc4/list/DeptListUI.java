package org.example.jdbc4.list;

import org.example.jdbc4.one.DeptDAO;
import org.example.jdbc4.one.DeptVo;

import java.util.ArrayList;

public class DeptListUI {
    public static void main(String[] args) throws Exception {
        DeptDAO dao = new DeptDAO();
        //모든 리스트를 가지고 오자
        ArrayList<DeptVo> list = dao.list();
        //반복해서 꺼내서 출력~! {vo,vo}
        for(DeptVo bag : list){
            System.out.println("검색한 번호"+bag.getDeptno());
            System.out.println("검색한 이름"+bag.getDname());
            System.out.println("검색한 지역"+bag.getLoc());
            System.out.println("-------------------");
        }//for

    }
}
