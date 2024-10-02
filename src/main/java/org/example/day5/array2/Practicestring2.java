package org.example.day5.array2;

import java.util.Arrays;
import java.util.Scanner;

public class Practicestring2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String all = "국어, 영어, 수학, 컴퓨터";

        String[] setAll = all.split(", ");

        for (int i = 0; i < setAll.length; i++) {
            setAll[i] = setAll[i].trim();
        }
        System.out.println(Arrays.toString(setAll));
        System.out.println("과목수는\t" + setAll.length);

        System.out.print("컴퓨터의 위치는>>");
        for (int i = 0; i < setAll.length; i++) {
            if (setAll[i].equals("컴퓨터")) {

                System.out.println(i + 1);
            }

        }//for

        int count = 0;
        for (int i = 0; i < setAll.length; i++) {
            if (setAll[i].length() < 3) {
                count++;
            }
        }
        System.out.print("과목이 3글자 미만인 수:");
        System.out.println(count);


    }//main
}//class
