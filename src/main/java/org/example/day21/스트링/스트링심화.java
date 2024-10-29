package org.example.day21.스트링;

public class 스트링심화 {
    public static void main(String[] args) {
        String s ="퐁퐁"; //100
        String s2 ="퐁퐁"; //100
        System.out.println(s);
        System.out.println(s2);
        //참조형이 가르키는 값을 비교
        System.out.println(s.equals(s2));
        //참조형 변수내에 들어있는 주소 비교
        System.out.println(s == s2);
        s2 = "하하";//200
        System.out.println(s == s2);
        s2="홍홍";//300
//스트링은 값이 변하면 새주소로 할당을 해서 사용하지말자
        //StringBuilder를 쓰자!
        for (int i = 0; i < 10; i++) {
            s2 =i  + "번";
        }
        StringBuilder sb = new StringBuilder();
//        sb.append("하하하하1");
//        sb.append("하하하하2");
//        sb.append("하하하하3");
//        System.out.println(sb);
//        sb.replace(0,3,"호호호");
//        System.out.println(sb);
//        sb.delete(0,4);
//        System.out.println(sb);
//        sb.deleteCharAt(0);
//        System.out.println(sb);
//        System.out.println(sb.indexOf("2"));
//        sb.insert(1,"옹");
//        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb);
//        String result = sb.toString();
//        System.out.println(result);

        String[] str = {"나는","홍길동","이다"};
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb2.append(str[i]);
        }

        System.out.println(sb2);
    }
}
