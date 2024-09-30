package org.example.day4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        /*다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
           (단, 다음에서 입력한 답이 1이면 열차, 2이면 배, 3이면 비행기를 타고 감.)
           가고 싶은 곳 (보기, 1)백두산, 2)한라산, 3)후지산) 입력 >> 1
           결과 출력은 당신이 가고 싶은 곳인 백두산은 열차를 타고 가야합니다.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("가고싶은 장소를 선택하세요.");
        System.out.print("보기>>>");
        String[] arr = {"백두산","한라산","후지산"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1)+")" + arr[i] +"\t");
        }
        System.out.println();
        System.out.println("번호를 선택해 주세요");

        int num =sc.nextInt();
        if(num ==1 ){
            System.out.println(arr[num-1]+"은 열차를 타고가야합니다.");
        }
        else if(num ==2 ){
            System.out.println(arr[num-1]+"은 배를 타고가야합니다.");
        }
        else{
            System.out.println(arr[num-1]+"은 비행기를 타고가야합니다.");
        }

        sc.close();

    }//main
}//class
