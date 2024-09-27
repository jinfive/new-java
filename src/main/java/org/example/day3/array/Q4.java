package org.example.day3.array;

public class Q4 {
    public static void main(String[] args) {
        /*
            4. 개수가 3개인
            문자열(String) 배열을 만들어(처음에는 값을 모르고
            있는 경우)
            4-1. 각 인덱스의 자리에 여행가고 싶은 곳을 제일 가고 싶은 곳부터 순서대로
          세 곳을 넣어서 저장(부산, 제주도, 전주인 경우)
        4-2. 전체 프린트
        4-3. 다음과 같이 프린트되도록 처리
          내가 첫 번째 가고 싶은 곳은 부산이고,
          마지막 가고 싶은 곳은 전주이다.
         */
        String[] city = new String[3];
        city[0] ="제주도";
        city[1]="도쿄";
        city[2]="양양";

        for(String c:city){
            System.out.println(c);
        }
        System.out.println("내가 가장 가고 싶어 하는 곳은 "+city[0] + " 입니다.");
        System.out.println("내가 마지막으로 가고 싶어 하는 곳은 "+ city[2] + " 입니다.");

    }
}
