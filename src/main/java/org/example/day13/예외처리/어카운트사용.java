package org.example.day13.예외처리;

public class 어카운트사용 {
    public static void main(String[] args) {
        Account account = new Account();
        try {
            account.money();
        } catch (MyException e) {
            System.out.println("main에서 에러 처리함");
            System.out.println(e.getMessage());
        }
    }
}
