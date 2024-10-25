package org.example.Day19.디자인패턴;

public class User implements 옵저버{
    String name;
    @Override
    public void update(String message) {
        System.out.println(name + "가 메시지를 보냄>>>"+ message);
    }//구현

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}//class
