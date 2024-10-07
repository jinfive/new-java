package org.example.day6.array3;

public class 다차원배열2 {
    public static void main(String[] args) {
        int[][] n2 = new int[3][]; //변수의 개수 5개
        System.out.println(n2.length);
        //총 메모리 ==>20, 참조형4
        //n2 ,n2[0] ,n2[1] ,n2[2] ==>16byte
        //length ==> 4byte
        System.out.println(n2[0]);
        System.out.println(n2);//주소 출력

        //1차원 배열 3개를 만들어서 넣어보자
        //한줄복사 cmd + d
        int[] r1 = new int[10];
        int[] r2 = new int[15];
        int[] r3 = new int[12];
        System.out.println(r1);

        n2[0] = r1;//2차원 배열에 넣어줌
        n2[1] = r2;//2차원 배열에  넣어줌
        n2[2] = r3;//2차원 배열에 넣어줌

        System.out.println(n2[0].length);//10 출력

        for (int i = 0; i < n2.length; i++) {
            for (int j = 0; j < n2[i].length; j++) {
                System.out.print(n2[i][j] + "\t");
            }//for
            System.out.println();
        }//for
    }//mian
}//class
