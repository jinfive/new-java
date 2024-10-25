package org.example.Day19.디자인패턴;

public class 채팅방만들기 {
    public static void main(String[] args) {
        채팅방 room = new 채팅방();


        User user = new User("홍길동");
        room.add(user);
        room.add(new User("김길동"));
        room.add(new User("이길동"));

        room.notifyUsers("오늘은 금요일");


        //채팅창 홍길동 삭제
        room.remove(user);

        room.notifyUsers("내일은 토요일");



    }
}
