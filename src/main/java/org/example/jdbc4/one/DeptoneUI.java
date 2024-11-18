package org.example.jdbc4.one;

public class DeptoneUI {
    public static void main(String[] args) throws Exception {
        DeptDAO dao = new DeptDAO();
        DeptVo bag = dao.one(2);
        System.out.println("검색한 번호"+bag.getDeptno());
        System.out.println("검색한 이름"+bag.getDname());
        System.out.println("검색한 지역"+bag.getLoc());

    }
}
