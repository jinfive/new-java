package org.example.day2.review;

public class Test3 {
    public static void main(String[] args) {
        String id = "root";
        String pwd = "1234";

        System.out.println(id.equals("root"));
        System.out.println(pwd.equals("1234"));
        System.out.println(id.equals(pwd) && pwd.equals("1234")); //.equals는 문자열 비교하는 메서드
    }
}