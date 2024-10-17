package org.example.day13.예외처리;

public class 예외처리메인2 {
    public static void main(String[] args) throws Exception {
        에러발생3 error = new 에러발생3();
        try {
            error.call();
        } catch (Exception e) {
            System.out.println("부르는곳에서 예외처리를 하고싶다.");
        }
        System.out.println();//에러 있는 메서드 호출함
        System.out.println("에러 발생후 실행될까요?");
        System.out.println("에러 발생후 실행될까요?");
        System.out.println("에러 발생후 실행될까요?");
        System.out.println("에러 발생후 실행될까요?");
        System.out.println("에러 발생후 실행될까요?");
    }
}
