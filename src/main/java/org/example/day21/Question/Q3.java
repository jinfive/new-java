package org.example.day21.Question;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    /*
    3. String[] s3 = {"제주도", "부산", "울릉도"};
   s3 목록에 "울산", "파주", "인천"추가 후, 첫번째 위치에 있는 것 삭제
   부산을 마산으로 변경후 하나의 String으로 묶어서 프린트
     */
    public static void main(String[] args) {
        String[] s3 = {"제주도", "부산", "울릉도"};
        StringBuilder sb = new StringBuilder();
        for(String s : s3) {
            sb.append(s);
        }
        sb.append("울산");
        sb.append("파주");
        sb.append("인천");

        System.out.println("기존의 배열>>>>\t"+sb);
        sb.delete(0,3);
        System.out.println("삭제후 배열>>>>\t"+sb);
        sb.replace(0,2,"마산");
        System.out.println("최종 배열>>>>\t"+sb);
        System.out.println("객체생성 이용");
        Solution1 s = new Solution1();
        s.sol(s3);

    }
}
class Solution1 {
    void sol(String[] s){
        List<String> list= new ArrayList<>();
        list.add("울산");
        list.add("파주");
        list.add("인천");
        list.remove(0);
        list.set(1,"마산");
        String result = String.join(",",list);
        System.out.println(result);


    }
}