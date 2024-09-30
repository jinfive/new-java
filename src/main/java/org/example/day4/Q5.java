package org.example.day4;

import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        /*
            random한 값 1부터 100까지 배열에 넣어 전체 출력(씨앗값 : 555), length는 1000
            80이상인 개수, 70~79인 수 개수, 50~69인 수 개수, 49보다 작은 수 개수 카운트하여 출력
         */

        Random r = new Random(555);
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100)+1;
        }
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for(int x:arr) {
            if(x>= 80){
                count++;
            }
            else if(x<80 && x >=70){
                count2++;
            }
            else if(x<70 && x >=50){
                count3++;
            }
            else {count4++;}
        }
        System.out.println("80 이상인 개수"+count +"\t70~79인 수 개수"+count2 +"\t50~69인 수 개수"+count3 +" \t49보다 작은 수 개수 "+count4);
    }
}
