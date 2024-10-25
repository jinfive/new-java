package org.example.Day19.스트림심화;

import java.util.ArrayList;
import java.util.List;

public class 객체스트림 {
    public static void main(String[] args) {
        //컬렉션,배열,파일,랜덤하게 만들 수 있음.
        //1.컬렉션(list,set,map,queue)
        List<Integer> list =new ArrayList<>();
        //stream<Interger>를 생성
        //통로<Interger주소,Interger주소,주소>
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        System.out.println(list);
        list
                .stream()
                .map(x->x + 100)
                .forEach((x -> System.out.println(x)));
        System.out.println( list
                .stream()
                .map(x->x + 100)
                .mapToInt(Integer::intValue)//기본형 스트림 변경
                .sum());
    }
    //mapToInt(Integer::intValue) == .mapTOInt(x -> Integer.intValue(x))>> int스트림으로 변경하는 방법
    


}
