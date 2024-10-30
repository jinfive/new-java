package org.example.day22.문풀;

import org.example.ArrPrint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q13 {
    //배열컬랙션 변환
    public static void main(String[] args) {
        String[] s = {"박명수","유재석","김종국","송지효","하하","싸이"};
        //List<String> list = Arrays.asList(s)>>> 길이조절 불가

        List<String> list = new ArrayList<>(Arrays.asList(s));//길이조절 가능
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        int find = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).length() < 3){
                find = i;
            }
        }//for
        list.remove(find);
        System.out.println(list);

        list.set(1,"유재돌");
        System.out.println(list);

        list.add("김종민");
        System.out.println(list);

    }
}
