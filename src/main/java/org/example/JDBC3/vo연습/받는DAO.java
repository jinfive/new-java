package org.example.JDBC3.vo연습;

public class 받는DAO {
    public void print(Bag bag){
    //가방을 전달 받는 쪽
        //파라메터 bag넣어야해
        //값을 꺼내서 처리
        //실무는 가방에 들어 간게 잘 들어갔나 확인
        System.out.println(bag);
        System.out.println("받은 이름은"+bag.getName());
        System.out.println("받은 나이는"+bag.getAge());
        System.out.println("받은 취미는"+bag.getHobby());
        System.out.println("받은 전화번호는"+bag.getTel());
    }
}
