package org.example.Day18.디자인패턴;

import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) {
        ObjectFactory objectFactory = new ObjectFactory();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("어떤 객체를 생성할래요?/ A ,B");
            String input = sc.next();
            if(input.equalsIgnoreCase("exit")){
                System.out.println("프로그램 종료");
                break;
            }
            Object obj = objectFactory.creatObject(input);
            if(obj == null){
                System.out.println("유효x");
            }
            else {
                System.out.println(input + "입력됨");
            }
        }
    }
}
