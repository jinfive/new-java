package org.example.day6.array3;

public class 다차원배열 {
    public static void main(String[] args) {
        /*가로는 행 = row ,세로는 열 column
        가로의 개수:2
        세로의 개수는 3
        {
        0 1   2
       0 {0,0,0}, 사이즈 3
        1{0,0,0}  사이즈 3
        }
        개수 length ==길이 == 사이즈
         */

        int[][] seat = new int[2][3]; //행, 열의 개수
        seat[0][0] = 100;
        seat[0][2] = 200;
        seat[1][1] = 300;
        seat[1][2] = 400;

        System.out.println(seat[1][0]);
        System.out.println(seat.length);//2 행을 출력한다.
        System.out.println(seat[0].length);//열을 출력
        for (int i = 0; i < seat.length; i++) { //행의 인덱스
            for (int j = 0; j < seat[1].length; j++) {//열의 인덱스
                System.out.print(seat[i][j] + " ");
            }//for
            System.out.println();
        }//for

    }//main
}//class
