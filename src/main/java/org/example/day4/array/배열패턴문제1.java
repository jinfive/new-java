package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class 배열패턴문제1 {
    public static void main(String[] args) {
        Random r = new Random(55); //seed는 55
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1; // 범위 1~100까지
        }//for
        System.out.println(Arrays.toString(arr));//for문 없이 배열 확인
        //Arrays.sort(arr); //배열의 내용을 오름차순으로 정령(작은수 --->큰수) 원본을 파괴 파괴함수.
        //System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------------------");
        int minus = 0;
        for (int x : arr) {
            minus -= x;
        }
        System.out.println(minus);
        System.out.println("-----------------------------------------");

        int sum = 0;
        for (int x : arr) {
            if (x > 50) {
                sum += x;
            }//if
        }//for
        System.out.println(sum);
        System.out.println("-----------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 80) {
                System.out.println("최초 80 이상의 값의 위치\t" + (i + 1));
                break;
            }
        }//for
        /*
        1.배열을 만들어서 나중에 반복문을 이용해서 많은양의 데이터 넣기
        1-1.int배열 인데 Length가 10인
        1-2Random을 이용해서 값 넣기 1~100 범위 (시그값 55)
        1-3 생성된 배열 전체 출력


        2.배열에 있는 값을 꺼내어서 누적
        2-1.감소하여 누적하는 변수 minus선언해 초기화
        2.2.배열에 값 꺼내어 계속 감소
        2.-3.minus출력


        3.배열에 있는 값을 반복해서 처리하는데 조건이 있는 경우
        3-1 더해서 누적하는 함수 sum 선언후 초기화
        3-2.배열에 있는 값중 50보다 큰것만 누적
        3-3 sum값 출략

        4; 배열에 있는 값을 가지고 위치를 찾는 경우
        4-1.배열내에 80보다 큰 수의 위치를 맨 앞부터 하나만 찾아 그 위치를 프린트
        4-2.80보다 큰 값을 찾으면 반복문 종료
         */
    }
}
