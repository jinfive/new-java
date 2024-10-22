package org.example.day16.추상클래스;

public class 전화기사용 {
    public static void main(String[] args) {
        //abstract가 들어가면 객체생성이 불가능하다.
        ApplePhone1 applePhone1 = new ApplePhone1();
        ApplePhone2 applePhone2 = new ApplePhone2();
        ApplePhone applePhone3 = applePhone1;
        String data = applePhone3.DATA;
        System.out.println(data);

    }
}
