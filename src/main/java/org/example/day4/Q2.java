package org.example.day4;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("숫자를 입력해 보세요>>>\t");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double avg = (double) sum/ arr.length;
        System.out.println("합계:"+sum+"평균:"+avg);
        sc.close();
    }
}
