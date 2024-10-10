package org.example.day8.class만들기;

public class 계산기 {
    //필드 X
    //함수명(파라메터~)
    //파라메터 --> 매개변수
    //사용하는 곳과 실제 처리하느 곳에
    //중간다리 역할의 변수라해서 매개변수라고 한다


    public int plus(int x, int y) { // 메서드 선언 수정
        System.out.println("더하기 기능 처리 내용");
        System.out.println(x + y);
        return x + y;
    } // 더하기

    public void 뺴기(int x, int y) {
        System.out.println("빼기 기능 처리 내용");
        System.out.println(x - y);
    } // 빼기

    public void 곱하기(int x, int y) {
        System.out.println("곱하기 기능 처리 내용");
        System.out.println(x * y);
    } // 곱하기

    public void 나누기(int x, int y) {
        System.out.println("나누기 기능 처리 내용");
        System.out.println(x / y);
    } // 나누기
}
