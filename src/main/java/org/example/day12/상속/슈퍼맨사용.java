package org.example.day12.상속;

public class 슈퍼맨사용 {
    public static void main(String[] args) {
        슈퍼맨 s = new 슈퍼맨('남',"클락",78);
//        s.gender ='남';
//        s.name="클락";
//        s.power = 78;

        System.out.println(s);
        s.run();
        s.isEat();
        s.fly();
        s.isSleep();
    }//main
}
