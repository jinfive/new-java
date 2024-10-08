package org.example.day7.review;

public class 변수구분 {
    int z  ; //전역변수 >>>>자동으로 초기화!
    public static void main(String[] args) {
        //저장공간을 만들고, 그 저장공간에 값을 넣는다!
        //선언할 때 --> 저장공간을 만든다.
        //타입명 변수명>>선언!
        int x; //쓰레기 값이 들어있는 상태
        int y = 0;//변수만들 때 초기화를 꼭 해주세요...
        //==>자바에서는 선언의 위치가 이 변수가 사용될 수 있는 범위를 결정!
        //==>x ,y변수는 main() 메서드 내에서만 사용이 가능하다.!
        //지역변수 local <     >전역변수global
        for (int i = 0; i < 3; i++) {
            int imsi =0; //for문 밖에서는 사용이 불가하다!
            //imsi , i는 for문 지역내에서만 사용이 가능함
        }//for

    }//main
}//class
