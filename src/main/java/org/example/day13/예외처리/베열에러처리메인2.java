package org.example.day13.예외처리;

public class 베열에러처리메인2 {
    public static void main(String[] args) {
        배열에러2 ar2 = new 배열에러2();
        try {
            ar2.array();
        } catch (Exception e) {
            System.out.println("여기서 처리함");
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
    }
}
