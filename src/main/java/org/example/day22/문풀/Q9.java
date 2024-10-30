package org.example.day22.문풀;

public class Q9 {
    //문자 반복 출력
    public static void main(String[] args) {
        String s = "hello";
        int k = 3;
        //1.n을 char로 분리시켜서 1.배열 2.charAt
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char one : c) {
            for (int i = 0; i < k; i++) {
                sb.append(one);
            }
        }//for
        System.out.println(sb.toString());//toString문자열 변경
        //2.k만큼 반복해서 -for
        //3.붙이자.
        //스트링빌더가 필요.

    }
}
