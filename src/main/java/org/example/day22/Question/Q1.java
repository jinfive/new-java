package org.example.day22.Question;

import java.util.Stack;

public class Q1 {
    public static void main(String[] args) {
        /*
        스택을 이용해서 푸세요.
   String[] s = {"밥", "커피", "밥", "커피", "밥", "밥"};
   식사(밥)먹은 후에 커피를 마셨으면  true, 아니면 false
         */
        Stack<String> stack = new Stack<>();
        String[] s = {"밥", "커피", "밥", "커피", "밥", "밥"};
       for (int i = 0; i < s.length; i++) {
           if(s[i].equals("밥")){
               stack.push(s[i]);
           }
           else if(s[i].equals("커피")){
               try {
                   if(s[i-1].equals("밥")){
                       System.out.println(true);
                   }   else{
                       System.out.println(false);
                   }
               } catch (Exception e) {
                   throw new RuntimeException(e);
               }//catch

           }//elseif
       }
    }
}
