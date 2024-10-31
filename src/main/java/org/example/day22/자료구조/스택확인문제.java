package org.example.day22.자료구조;

import java.util.Scanner;
import java.util.Stack;

public class 스택확인문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] str = s.split(" ");
            if (str[0].equals("push")) {

                stack.push(Integer.parseInt(str[1]));

            } else if (str[0].equals("pop")) {
                try {
                    System.out.println(stack.pop());
                } catch (Exception e) {
                    System.out.println(-1);
                }

            }//else if
            else if (str[0].equals("size")) {
                System.out.println(stack.size());
            } else if (str[0].equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (str[0].equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }

        }//for
        sc.close();
    }
}
//2     2
//2     2
//0     0
//2     2
//1     1
//-1    -1
//0     0
//1     1
//-1    -1
//0     0
//      3