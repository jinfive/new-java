package org.example.day5.review;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        /*
        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {99, 100, 88, 80, 70};
        //1. 성적이 2학기에 향상된 학생수를 카운트 프린트
        //2.성적이 1,2학기 동일한 학생수를 카운트 프린트
        //c타입 형식 for문 for (int i ; ;< ;i++) i를 이용
        //for -each문 : 간단,값을 출력하는 용도.
        //누적 시키는 변수는 반복문 안에 넣지말기
        int high = 0, same = 0;
        for (int i = 0; i < term1.length; i++) {
            if (term1[i] == term2[i]) { //조건에 해당하는 구문은 결과가 무조건 논리형
                same++;
            }//if
            else if (term1[i] < term2[i]) {
                high++;
            }//else if
        }//for
        System.out.println("향상된 성적"+high + "\t" +"동일한 성적 " + same);


        Scanner sc = new Scanner(System.in);
        int[] data = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("숫자 입력>>");
            data[i] = sc.nextInt();

        }//for
        System.out.println(Arrays.toString(data));
        int sum = 0;
        for(int x : data) {
            sum += x;
        }
        System.out.println(sum);
        System.out.println((double) sum/data.length);

        Random r = new Random(44);
        int[] n = new int[1000];
        int sum = 0;
        for(int i = 0 ; i<n.length ; i++) {
            n[i] = r.nextInt(1000)+1;
            sum += n[i];
        }//for
        System.out.println(Arrays.toString(n));
        System.out.println(sum);
        System.out.println((double)sum/n.length);

        Scanner sc = new Scanner(System.in);
        System.out.println("가고싶은곳 보기: 1)백두산 2)한라산 3) 후지산 숫자를 입력하세요>>>");
        int input = sc.nextInt();
        String result = null;
        switch (input) {
            case 1:
                result = "백두산은 열차";
                break;
            case 2:
                result = "한라산은 배";
                break;
            case 3:
                result = "후지산은 비행기";
                break;
            default:
                result = "걸어가";
        }
        System.out.println("당신이 가고싶은 곳인" + result +"타고 가십시오.");
*/
        Random r = new Random(555);
        int[] nums = new int[1000];
        int c80 = 0,c70=0,c50=0,c0 =0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(100) + 1;
            if(nums[i]>=80){
                c80++;
            }
            else if(nums[i]>=70){
                c70++;
            }
            else if(nums[i]>=50){
                c50++;
            }
            else if(nums[i]>=0){
                c0++;
            }
        }//for
        System.out.println(c80 +"\t" +c70 +"\t" +c50 +"\t" +c0 );
    }//main
}//class
