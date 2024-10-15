package org.example.day10.Question;

public class Q5 {
    public static void main(String[] args) {
        String id = "Krt8599@naver.com";
        String pwd = "Qwer12345?";

        String regex1 = ".*@.+\\.com$";//@포함하고 .com으로 끝나는지
        String regex2 = "^(?=.*[A-Za-z])(?=(?:.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,})";//8글자이상 대문자,특수기호2개를 포함하는지

        System.out.println(id.matches(regex1));
        System.out.println(id.matches(regex2));
    }
}
