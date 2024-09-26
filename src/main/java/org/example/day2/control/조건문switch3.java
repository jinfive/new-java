package org.example.day2.control;

public class 조건문switch3 {
    public static void main(String[] args) {
        String food = "짬뽕";
        switch (food) {
            case "짬뽕":
                System.out.println("중국집");
                break;
            case "우동":
                System.out.println("분식집");
                break;
            case "감자탕":
                System.out.println("한식");
                break;
            default:
                System.out.println("집가자");
        }
    }

}
