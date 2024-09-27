package org.example.day2.control;


import java.util.Scanner;

public class BasicQ1Cli {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("게임을 계속 하시겠습니까??(Y/N)");
            String input = sc.nextLine();
            if(input.equals("N")){
                System.out.println("게임을 종료합니다.");
                System.exit(0);
            }
            else if(input.equals("Y")){
                System.out.print("처음 숫자를 입력하세요>>>");
                int a = sc.nextInt();

                System.out.print("두번째 숫자를 입력하세요>>>");
                int b = sc.nextInt();

                if(a>b){
                    System.out.println("첫번째 사람이 이겼습니다");
                } else if (a<b) {
                    System.out.println("두번째 사람이 이겼습니다.");
                }
                else {
                    System.out.println("비겼습니다.");
                }
            }
            System.out.println("--------------------------------------");
            System.out.println();
        }//while 종료
    }
}