package org.example.day2.control;

public class 조건문if2 {
    public static void main(String[] args) {
        int hour = 16;
        while (true) {
            if (hour < 11) {
                System.out.println("아직 멀었다ㅠㅠ");
            } else if (hour < 14) {
                System.out.println("거의 다 왔다");
            } else if (hour < 18) {
                System.out.println("조금 남았다.");
            }
            else  {
                System.out.println("집가자");
                break;
            }//else 종료
        }//while종료
        System.out.println("공부 많이 했다.");
    }
}
