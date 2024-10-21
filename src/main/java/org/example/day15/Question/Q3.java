package org.example.day15.Question;

import org.example.day15.참조형형변환.사람;

import java.util.ArrayList;
//다음 코드에 대해 자동형변환 /강제형변환 /박싱/언박싱 관점에서 주석을 달아 설명하시오
public class Q3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("자바"); //업케스팅 >> 자동형변환

        list.add(new 사람()); //업케스팅 자동형변환
        list.add(new ArrayList());//업케스팅 자동 형변환

        String s = (String)list.get(0);//다운케스팅 강제 형변환

        list.add(100); //오토 박싱 > Interger > 업케스팅 (Object)

        int i = (Integer)list.get(3); //다운케스팅
        /*
        list.get(3)을 호출하면 Object 타입으로 100이라는 값을 가진 Integer 객체를 반환합니다.
        (Integer)를 사용하여 이 Object를 Integer 타입으로 강제형변환합니다.
        이 이후 int i에 값을 할당할 때, Integer 객체가 자동으로 언박싱되어 기본형 int로 변환됩니다.
         */
    }
}
