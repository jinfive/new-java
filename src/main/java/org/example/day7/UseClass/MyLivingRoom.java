package org.example.day7.UseClass;

import org.example.day7.MakeClass.Chair;
import org.example.day7.MakeClass.Tv;

public class MyLivingRoom {
    public static void main(String[] args) {
        Tv myTv = new Tv();
        Tv yourTv = new Tv();
//        Chair chair = new Chair();
//        //tv.powerOn();
//        //tv.changeChannel();
//        //tv.powerOff();
//
//        //System.out.println(tv.size);
//        //System.out.println(tv.price);
//        //System.out.println(tv.company);
//        chair.heightUp();
//
//        //tv.price = 10000;
//        chair.size =100;
//        System.out.println(tv.price);
//        chair.getsize();
        myTv.채널을바꾸다();
        yourTv.유튜브보다();
        myTv.ch = 7;
        myTv.vol = 9;
        myTv.onOff = true;

        yourTv.ch = 9;
        yourTv.vol = 12;
        yourTv.onOff = true;

    }//main
}//class
