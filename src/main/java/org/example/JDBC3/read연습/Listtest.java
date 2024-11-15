package org.example.JDBC3.read연습;

import java.util.ArrayList;

public class Listtest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("월");
        list.add("화");
        list.add("수");
        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.get(0));

        System.out.println("-----------------------------------------");
        ArrayList<MemberVo> list2 = new ArrayList<>();
        MemberVo m1 = new MemberVo();
        m1.setId("11");
        m1.setPw("11");

        MemberVo m2 = new MemberVo();
        m2.setId("22");
        m2.setPw("22");

        list2.add(m1);
        list2.add(m2);

        System.out.println(list2);
        System.out.println(list2.get(0));
        System.out.println(list2.get(1));
    }
}
