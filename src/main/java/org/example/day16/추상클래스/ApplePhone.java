package org.example.day16.추상클래스;

public abstract class ApplePhone implements MegaPhone {
    int size;

    public abstract void camera();
    //상속받은 곳에서 반드시 구현하도록 강제성을 클래스에 지정하고 싶을때
    //클래에서 추상메서드 구현이 가능하다.
    //이 클래스로는 객체 생성이 불가능
    @Override
    public void siri() {
        System.out.println("시리야");
    }

    @Override
    public void map() {
        System.out.println("지도");
    }

    @Override
    public void internet() {
        System.out.println("인터넷");
    }

    @Override
    public void call() {
        System.out.println("전화");
    }

    @Override
    public void text() {
        System.out.println("전화");
    }

    @Override
    public void kakao() {
        System.out.println("카톡");
    }
}
