package org.example.day22.Question;

import java.util.TreeSet;

public class Q3 {
    public static void main(String[] args) {
        /*
        treeSet을 이용해서 푸세요.
   int[] s3 = {11, 3, 78, 9, 2, 2, 100, 3}을 중복을 제거후 오름차순으로
   정렬 후 가장 큰 값과 가장 작은 값을 출력하세요.
         */
        int[] s3 = {11, 3, 78, 9, 2, 2, 100, 3};
        TreeSet<Integer> tree = new TreeSet<>();
        for(int i : s3) {
            tree.add(i);
        }
        System.out.println(tree);
        System.out.println(tree.last());
        System.out.println(tree.first());
    }//main
}
