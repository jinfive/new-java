package org.example.day3.order;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        //입력        ram에 있어야함
        //int x = 100;
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력해 주세요>>> ");//print() , printf()>>소수점 사용
        int age = sc.nextInt(); // 모든 입력은 타입을 컴퓨터는 String으로 인식한다 ->계산 할려면 int로 변경해줘야한다.
        System.out.print("아침을 먹었나요??(true/false)>>>  ");
        boolean result = sc.nextBoolean();

        //처리 ->cpu가 처리
        int nextAge = age + 1;
        String text = null;
        if(result ){
            text="점심을 조금 먹어도 되겠네요";
        }
        else{
            text="점심을 많이 드셔야겠네요";
        }

        //출력
        System.out.println("내년 나이는 "+ nextAge);
        System.out.println("오늘은 "+text);
    }
}
