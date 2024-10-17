package org.example.day13.Question;

public class Q2_error_main {
    public static void main(String[] args) {
        Q2_error q2 = new Q2_error();
        try {
            q2.callage();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("메인에서 에러 처리");
        }
        try {
            q2.callname();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("메인에서 에러 처리");
        }
    }
}
