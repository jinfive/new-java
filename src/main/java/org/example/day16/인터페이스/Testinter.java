package org.example.day16.인터페이스;

public interface Testinter {
    //설계도 역할!
    //아직 완전한 클래스가 아니야
    //테스트 해야한다,입력스트링으로 해야함
    public abstract void test(String name);//메서드를 만들다 말았네> 불완전 > 추상메서드(abstract)
    //public abstract는 생략이 가능
    //검증해야해, 입력은 시간과 분을 입력 ,리턴을 잘 되야함
    //논리형 리턴
    //메서드 명 result

    public abstract boolean result(int h , int m);
    //인터페이스는 추상메서드로만든다. 기능 중심으로만 해서 설계
    //  필드는 안들어가


}
