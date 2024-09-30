package org.example.day4;

public class Q1 {
    public static void main(String[] args) {
        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {99, 100, 88, 80, 70};

        int up = 0;
        int eq = 0;
        for (int i = 0; i < term1.length; i++) {
            if (term1[i] < term2[i]) {
                up++;
            }//if
            else if (term1[i] == term2[i]) {
                eq++;
            }//else if
        }//for
        System.out.println("성적이 오른 과목 수:"+ up +"\t 성적이 동일한 과목수 "+eq);
    }//main
}//class
