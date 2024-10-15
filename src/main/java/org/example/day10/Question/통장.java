package org.example.day10.Question;

public class 통장 {
    String name;
    String ssn;
    int money;
    static int count;
    //static키워드가 붙어있는 변수는
    //객체 생성과 상관없이 클래스에서 바로 접근해서 사용 가능한 변수
    //클래스에서 바로 접근해서 사용 가능한 변수
    //정적변수,static변수,클래스 변수
    //"클래스.변수명" 접근해서 사용가능
    public 통장(String name, String ssn, int money) {
        this.name = name;
        this.ssn = ssn;
        this.money = money;
        count++;

    }

    @Override
    public String toString() {
        return "통장{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", money=" + money +
                '}';
    }
}
