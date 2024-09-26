package org.example.day2.review;

public class Test2 {
    public static void main(String[] args) {
        int x = 333;
        int y = 222;
        int sum = x + y;
        int minus = x - y;
        int mul = x * y;
        int div = x / y;
        int mod = x % y; // 나머지 연산자

        System.out.println("sum = " + sum);//결합 연산자
        //비교연산자,논리연산자 결과는 무조건 논리형 ( t/f)


        System.out.println(x == y);
        System.out.println(x >=y );

        //논리 연산자 (&& , || , !)
        char id = 'a';
        char pwd = 'b';

        System.out.println(id == 'a' && pwd == 'b');
        System.out.println(id == 'a' && pwd == 'c'); // 앞조건에 틀릴것 같은거 사용하면 성능면에서 좋음


        char pw1 = 'j';
        char pw2 = 'k';
        System.out.println(pw1 == 'j' || pw2 =='m' );// 앞조건에 맞을것  같은거 사용하면 성능면에서 좋음





    }
}