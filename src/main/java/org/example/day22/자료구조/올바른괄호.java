package org.example.day22.자료구조;

import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        //String s = "()()";
        String s = "(()";
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(s.charAt(i) == '('){
                stack.push(c);
            }
            else if(s.charAt(i) == ')'){
                if(stack.isEmpty()){
                    System.out.println("-1");
                    break;
                }
                else try {
                    stack.pop();
                } catch (Exception e) {
                    System.out.println("스텍이 비어있음.");
                }
            }//else if

        }
        if(stack.isEmpty()){
            System.out.println("1");
        }
        else {
            System.out.println("-1");
        }

    }
}
