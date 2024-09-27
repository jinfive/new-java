package org.example.day3.array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        //우리 가족 정보를 넣어보자
        //5명, 이름,나이,키,성별,아침여부
        //String[] names = new String[5];
        String[] names = {"홍길동", "심청이", "홍진오", "홍스카이", "찐감자", "찌그라미", "찐맹길"};
        //System.out.println(names[0]);
        System.out.println(names.length);
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
        }//for end
        System.out.println();
        System.out.println((Arrays.toString(names)));//[홍길동, 심청이, 홍진오, 홍스카이, 찐감자, 찌그라미, 찐맹길]
        System.out.println();
        int[] age = new int[7];
        age[0] = 54;
        age[1] = 50;
        age[2] = 25;
        age[3] = 22;
        age[4] = 7;
        age[5] = 4;
        age[6] = 1;
        for (int x:age) {
            System.out.print(x);
        }//for
        System.out.println();
        double[] height = {180,159.9,175.9,167,50,30,15};
        for (double x:height) {
            System.out.print(x);
        }//for
        System.out.println();
        System.out.println(Arrays.toString(height));
        System.out.println();
        char[] sex = {'남','여','남','여','여','남','여'};
        for (char s :sex){
            System.out.print(s);
        }//********************for-each문*****************

        System.out.println();

        boolean[] mornning = {false,true,true,false,true,false,true};
        for (int i = 0; i <mornning.length;i++){
            System.out.print(mornning[i]+"  ");
        }//for
        System.out.println();
        System.out.println(Arrays.toString(mornning));//[false, true, true, false, true, false, true]
        System.out.println();

        System.out.println(names[5]);

    }//main
}//class
