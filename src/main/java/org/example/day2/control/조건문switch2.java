package org.example.day2.control;

public class 조건문switch2 {
    public static void main(String[] args) {
        int mounth = 9;
        switch (mounth) {
            case 1:
            case 2:
            case 12:
                System.out.println("겨울");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("여름");
                break;
            case 10:
            case 11:
                System.out.println("가을");
                break;
        }
    }
}
