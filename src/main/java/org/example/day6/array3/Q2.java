package org.example.day6.array3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //가격배열1 이름 배열1
        int[] price = {1000,10900,10900,5500,1200};
        String[] name = {"사랑과 전쟁: 열두 번째 남자","인사이드 아웃","데드풀과 울버린","콰이어트 플레이스: 첫째 날","너의이름은"};

        System.out.println("네이버 시리즈온 실시간 영화 목록");
        for (int i = 0; i < price.length; i++) {
            System.out.println((i+1)+".\t"+name[i] + "\t- \t가격:" + price[i]+"원");
        }
        System.out.println();

        System.out.print("정보를 확인하고싶은 영화 번호를 선택하세요(1-5)>>");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= price.length; i++) {
            if(i== n ){
                System.out.println("선택한 영화 >>> " +name[i-1]);
                System.out.println("가격 >>> "+price[i-1]+"원");
                sc.close();
                System.exit(0);
            }
        }//for

    }
}
