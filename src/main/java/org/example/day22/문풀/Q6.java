package org.example.day22.문풀;

public class Q6 {
    //특정문자 제거하기
    public static void main(String[] args) {
        String str = "abcdef";
       String letter = "f";
        //myString 하나씩 빼서 f가 아니면 모으자!
        //String 모으기 위해서 Stringbuilder 사용하자

        StringBuilder sb = new StringBuilder();
        //1번 방법 .char배열로 만들어서
        //charAt() 사용
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c != (char)letter.indexOf(0)) {//letter.CharAt(0)
                sb.append(c);
            }
        }
        String s = sb.toString();
        System.out.println(s);

        String result = str.replaceAll(letter, "");
        System.out.println(result);

    }
}
