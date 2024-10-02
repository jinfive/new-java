package org.example.day5.array2;

public class StringBasic {
    public static void main(String[] args) {
        String s ="나는! 프로그래머야";
        String s2 = "진짜!!!";
        System.out.println(s +s2);

        String sum = s.concat(s2);
        System.out.println(sum);

        char c =s.charAt(0);//s스트링에 있는 것들중 0번을 추출!
        System.out.println(c);
        System.out.println(s2.charAt(2));
        System.out.println(s.endsWith("!")); //괄호 안에 있는 문자로 끝났냐??
        System.out.println(s2.endsWith("!"));
        System.out.println(s.contains("!"));//포함을 하냐?
        System.out.println(s2.contains("!"));
        System.out.println(s.substring());
    }
}
