package org.example.day11.review;

public class Day {
    String doing;//한 일
    int time;//시간
    String location;//장소

    static int count = 0;
    //static변수는 공유목적,누적목적 ==> 정적 변수 , 클래스 변수
    static int sum;//time 누적!!

    //스태틱 메서드 메모리 상주
    //static 메서드내 에서 내 것을 호출할 때 static메서드만 가능!
    public static double getAverage() {
        return sum / (double)count;
        //static메서드 내에 사용 가능한 변수는 static 변수만 사용 해야한ㄷ.
        //왜?? ==> static은 객체 생성하기 전에 언제든지 호출할 수 있는 개념이기 떄문에
        //객체 생성후 힙영역에 접근하여 사용하는 인스턴스 변수는 사용 불가능

    }//평균구하는 메서드

    //Day클래스내에서는 내 것이므로 그냥 메서드 이름()으로 바로 호출해서 사용이 가능
    public String getDoing() {
        return doing;
    }//게터
    public String getDoingTime() {
        return getDoing() + " " + time;
    }//게터

    //객체 생성시 맴버변수 초기화할 목적으로!
    //생성자 메서드, 객체 생성시 자동 호출!
    //*생성자 메서드가 되기 위한 조건
    //1.클래스 이름과 동일..
    //2.리턴타입을 명시해면 자동호출이 불가능.
    //생성자 특징
    //1.오버로딩이 가능하다.
    //2.프로그래머가 하나도 생성자를 명시하지 않으면, 컴파일러가 하나를 추가해준다.
    //public 클래스명(){....}-->입력매개변수가 없는 메서드를 생성해줌!
    //기본 생성자(default constructor) --> 입력매개변수가 없는 생성자 메서드.



    //--> 이 클래스로 생성된 객체(참조형 변수,day1)를 프린트할 때,
    //프린트할 스트링을 자동으로 만들어 주는 것!
    //모든 클래스는 toString() 메서드를 가지고 시작함.(묵시적)
    //패키지명.클래스명@주소 --> 원래는 이렇게 스트링을 만들어준다.

    public Day(String doing, String location, int time) {
        this.doing = doing;
        this.location = location;
        this.time = time;
        count++;
        sum = sum + time; //sum +=time;
    }
    //맨끝
    @Override
    public String toString() {
        return "Day{" +
                "doing='" + doing + '\'' +
                ", time=" + time +
                ", location='" + location + '\'' +
                '}';
    }
}
