package org.example.day2.control;

public class 조건문if1 {
    public static void main(String[] args) {
        //가입 id
        int id  =  111;
        //입력한 id
        int id2 = 222;

        if(id == id2){//조건이 참이면
            System.out.println("아이디가 동일");
        }
        else {//조건이 거짓이면
            System.out.println("아이디가 다름");
        }
    }
}
