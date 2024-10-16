package org.example.day11.스태틱;


public class 운동하자 {
    public static void main(String[] args) {
        운동 w1 =new 운동("테니스","친구",3);
        운동 w2 =new 운동("러닝","크루",2);

        System.out.println(w1);
        System.out.println(w2);
        System.out.println("운동 종목 수"+운동.count);
        System.out.println("운동시간 "+w2.getTime());
    }
}
