package org.example.day16.추상클래스;

public interface MegaPhone extends Phone,Gps{
    void siri();//6의 추상메서드 정의
    //인터페이스는 다중상속이 가능
    //인터페이스는 기능 중심으로 설계 -> 추상메서드만
    //필드x
    //공유하고 싶은 상수가 있으면 가능!
    public static  final  String DATA = "대한민국";//상수


}
