package org.example.day22.문풀;

public class Q10 {
    //문자열 뒤집기
    public static void main(String[] args) {
        //뒤집어서 스트링으로 모으자!
        //StringBuilder
        String s = "bread";

        int last = s.length() - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = last; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
