package org.example.day4;

import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        Random r=new Random(44);
        int[] n = new int[1000];
        for (int i = 0; i < n.length; i++) {
            n[i]=r.nextInt(1000)+1;
        }
        System.out.println(n[0]+n[2]+n[4]+n[99]+n[989]);

        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum+=n[i];
        }
        double avg = (double) sum/n.length;

        System.out.println("전채합계>>>."+sum +"\t평균>>>:"+avg);
    }
}
