package org.example.day15.Question;

import java.util.ArrayList;

public class Q4 {
    ArrayList <String> stack;
     public Q4() {
        this.stack = new ArrayList <>();
     }
     public void push(String item) {
         this.stack.add(item);
         System.out.println("push결과"+ stack);
     }
     public void pop() {
         if (this.stack.isEmpty()) {
             System.out.println("스택이 비어있음");

         }//If
         else {
             String poppedItem = this.stack.remove(this.stack.size() - 1); // 아이템 제거
             System.out.println("pop 결과: " + poppedItem); // pop된 아이템 출력
             System.out.println("현재 목록>>>>"+stack);
         }
     }
     public void peek() {
         System.out.println("peek 결과>>>>"+this.stack.get(this.stack.size()-1));

     }
}
