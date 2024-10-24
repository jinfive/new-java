package org.example.Day18.람다식;

public class My함수형인터페이스사용3 {
    //람다식 이용
    public static void main(String[] args) {
        함수형인터페이스 my = () -> System.out.println("람다식 구현");
        my.my메서드();
    }
}
