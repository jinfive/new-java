package org.example.Day18.람다식;

public class Person {
    public void action1(Workable w){
        w.work("홍길동","프로그래머");
    }
    public void action2(Speakable s){
        s.speak("hi~");
    }
}
