
package org.example.day6.array3;

import java.util.Scanner;

            public class Q2_1 {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int[][] arr = new int[3][10];
                    int count = 0;

                    while (true) {
                        System.out.println("좌석  --------------------------------------------------------------------");
                        for (int i = 0; i < arr[0].length; i++) {
                            System.out.print(i + "\t\t\t");
                        }//for

                        System.out.println();
                        System.out.println("예매석 --------------------------------------------------------------------");
                        for (int i = 0; i < arr.length; i++) {
                            for (int j = 0; j < arr[i].length; j++) {
                                System.out.print(arr[i][j] + "\t\t\t");
                            }//for
                            System.out.println();
                        }

                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("예매할 좌석번호를 입력하세요 0 입력시 종료됨 1입력시 예매 시작.");
                        int num = sc.nextInt();
                        if (num == 0) {
                            System.out.println("당신의 총 예매수는 "+ count+"입니다.");
                            System.out.println("당신의 총 금액 "+ (count*10000)+"입니다.");
                            break;
                        }//if
                        else if (num == 1) {
                            System.out.print("예매하실 행번호>>>");
                            int line = sc.nextInt();
                            System.out.print("예매하실 열번호>>>");
                            int row = sc.nextInt();
                            if(arr[line][row]==0){
                                arr[line][row] ++;
                                count++;
                                System.out.println("예매 완료");
                            }
                            else {
                                System.out.println("예매 불가");
                            }
                            
                        }//else if
                    }//while
                    sc.close();
                }//main
            }//class

