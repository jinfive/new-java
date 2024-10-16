package org.example.day12.상속;

public class 사람 {
    char gender;
    String name;

    public 사람(char gender, String name) {
        //super();컴파일할 때 무조건 생성자 첫줄은 super();
        this.gender = gender;
        this.name = name;
    }


    public void isSleep(){
        System.out.println("잠을 잡니다.");
    }
    public void isEat(){
        System.out.println("밥을 먹습니다.");
    }


}
