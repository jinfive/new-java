package org.example.day5.array2;

import java.util.Arrays;

public class 참조형복사2 {
    public static void main(String[] args) {
        int[] com1 = {100, 200, 300};
        int[] com2 = com1.clone();
        com2[0] = 96;

        System.out.println(Arrays.toString(com1));
        System.out.println(Arrays.toString(com2));
        System.out.println(com1 + " " + com2);

    }
}
