package org.example.day3.array;

public class array1 {
    public static void main(String[] args) {
        //배열을 만드는 방법 2가지
        //공간을 여러개 만들 때(배열) 처음에 몇게를 만들지 모르는 경우
        //유한 공간, 동일한 타입
        int[] s = new int[5];   //{0,0,0,0,0}  초기화된 값 0 이 생성
        //첫전째 값 프린트
        //첫번쨰 S 안에 주소가 가리키는 공간 s[0]
        //en번쨰 S 안에 주소가 가리키는 공간 s[1]
        System.out.println(s[0]);
        System.out.println(s[1]);

        s[0] = 100;

        System.out.println(s[0]);
        //'' 처음부터 값을 알고 있는 경우
        int [] s2 = {100,200,300, 400,500};
        System.out.println(s2[0]);
        System.out.println(s2[1]);

    }
}
