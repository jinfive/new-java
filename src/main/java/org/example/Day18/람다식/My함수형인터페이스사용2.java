package org.example.Day18.람다식;

public class My함수형인터페이스사용2 {
    public static void main(String[] args) {
        //2. 이름 없는 클래스로(익명 클래스) 바로 구현해서 사용하는 방법
        My함수형인터페이스구현1 my = new My함수형인터페이스구현1(){
            @Override
            public void my메서드() {
                System.out.println("익명 클래스로 구현");
            }//메서드
        };//익명클래스
        my.my메서드();
    }//메인

}//class
