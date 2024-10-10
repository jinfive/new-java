package org.example.day8.class만들기;

public class 일기장 {
    //속성---->항목(필드),맴버변수
    public String tiltle;//제목
    public String content;//내용
    public String weather;//날씨

    //기능---->메서드,맴버메서드
    //void(없다)
    public void 일기쓰다(){
        System.out.println("그림하나 그리고");
        System.out.println("제목넣고, 내용넣고 ,날씨를 쓴다.");
    }//일기쓰다.

    public void 일기삭제하다(){
        System.out.println("파일을 삭제하다.");
    }//일기삭제하다.
}//class
