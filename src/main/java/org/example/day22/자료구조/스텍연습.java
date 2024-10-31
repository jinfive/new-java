package org.example.day22.자료구조;

import java.util.Stack;

public class 스텍연습 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("홍길동");
        stack.push("김길동");
        stack.push("고길동");
        System.out.println(stack);
        System.out.println(stack.get(0));
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.contains("홍길동"));
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        try {
            System.out.println(stack.pop());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
