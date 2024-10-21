package org.example.day15.참조형형변환;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class 참조형4 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //가변길이,여러개 데이터를 다룰 때 사용
        //참조형(랩퍼클래스 ,포장클래스)으로 만들어주면 된다.
        list.add("안녕"); //String -> object 자동형변환
        list.add(new Date());//DAte -> object 자동형변환
        list.add(new Random());
        list.add(new Truck());
        list.add(100); // int - 오토박싱 > Interger - 자옫형변황(업케스팅)->Object
        list.add(1.2);//double ->Double ->object  오토 박싱
        list.add(true);//boolean->Boolean->Object
        list.add('a');


        System.out.println(list);
        //넣을때는 다 모으고 싶어서 Object으로 형변환 해서 다 집어 넣음

        System.out.println("----------------------------");
        //이제 꺼내 보자.
        System.out.println(list.get(0));
        Object name  =list.get(0);
        //System.out.println(name.);
        //Object으로 넣어서 object으로 꺼내오게 되고
        //String 메서드를 가지고 있지 않음.
        //꺼내서 String 메서드를 쓸떄는 String로 만들어 줘야함
        String name2= (String)list.get(0);//Stirng(작)<object(큰)
        System.out.println(name2.contains("rim"));
        //날짜 꺼내서 현재 시/분 프린트!
        Date date  =(Date)list.get(1);
        System.out.println(date.getHours() +":"+date.getMinutes() +":"+date.getSeconds());

        int x =(Integer)list.get(4);//int <- (오토언박싱)Interger <- Object
        Double y = (Double)list.get(5);
        double y2 = (double)list.get(5);
    }
}
