package org.example.day7.MakeClass;

public class Chair {
    //속성:높낮이 높이 ,사이즈
    //동작:높낮이 낮춤,높낮이 높임
    public double height = 0;
    public int size = 0;

    public void heightUp(){
        height++;
        System.out.println("현재 의자 높이"+height);
    }
    public void heightDown(){
        height--;
        System.out.println("현재 의자 높이"+height);
    }
    public void getsize(){
        System.out.println("내 의자의 사이즈는"+size);
    }
}
