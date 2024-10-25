package org.example.Day19.디자인패턴;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 에어컨 implements 에어컨옵저버 {
    int temp;
    List<String> words = Arrays.asList("alice", "hong", "park");

    public void setTemp(int temp) {
        for(String s : words){
            System.out.print(s + "님 ");
            update(temp);
        }
    }


    @Override
    public void update(int temp) {
            System.out.println( temp + "도 변경되었습니다.");
    }





}
