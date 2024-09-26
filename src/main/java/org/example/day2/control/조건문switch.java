package org.example.day2.control;

public class 조건문switch {
    public static void main(String[] args) {
        int day = 5;

        switch (day) { //실수 불가 ,long 불가 char 가능, String 가눙
            case 1:
            case 6:
                System.out.println("주말");
                break;
            case 2:
            case 3:
            case 5:
            case 4:
                System.out.println("평일");
                break;


        }
    }
}
