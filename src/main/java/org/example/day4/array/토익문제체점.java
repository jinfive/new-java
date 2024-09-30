package org.example.day4.array;

import java.util.Random;
//한줄 복사 cmd + d


public class 토익문제체점 {
    public static void main(String[] args) {
        Random r = new Random();

        int[] number =new int[990];
        for (int i = 0; number.length > i; i++) {
            number[i] = i;
        }
        int[] a = new int[990];
        for (int i = 0; a.length > i; i++) {
            a[i]=r.nextInt(4)+1;
        }
        int[] sol = new int[990];
        for (int i = 0; a.length > i; i++) {
            sol[i]=r.nextInt(4)+1;
        }
        System.out.println("번호:\t:\t답안\t\t내답");
        for (int i = 0; a.length > i; i++) {
            System.out.println(number[i]+"\t:\t"+sol[i]+"\t< - > \t"+a[i]);

        }
        int c = 0;
        int x = 0;
        for (int i = 0; a.length > i; i++) {
            if(sol[i]==a[i]){
                c++;
            }
            else {
                x ++;
            }
        }
        System.out.println("내점수> " + c+ "틀린수>" + x);



    }//main
}//calss
