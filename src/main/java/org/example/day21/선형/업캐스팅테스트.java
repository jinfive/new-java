package org.example.day21.선형;

public class 업캐스팅테스트 {
    int x =2;
    Object x2 = x;
    //Object(부모, 큰) <- 업캐스팅 - Integer(자식 , 작) <- 오토박싱 - int

    int [] n1 = {1,2,3};
    // 배열에서는 오토박싱이 안됌.
    //Object[] n = n1;
    Integer[] n2 = {1,2,3};
    Object[] n3 = {1,2,3};
    Object[] n4 = n3;

    String[] s = {"hi","hello"};
    Object[] O = s;
}
