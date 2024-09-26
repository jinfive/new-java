package org.example.day2.control;

import javax.swing.*;

public class Control2 {
    public static void main(String[] args) {

        String answer = "맑음";

//        String weather = JOptionPane.showInputDialog("날씨를 입력하세요");
//        JOptionPane.showMessageDialog(null, answer.equals(weather));

        double temp = 20;
        double humidity = 70;

//        double cTemp = Double.parseDouble(JOptionPane.showInputDialog("온도를 입려하세요"));
//        double cHumidity = Double.parseDouble(JOptionPane.showInputDialog("습도를 입력하세요"));        //Double.parseDouble() 이용시 쉽게 변환이 가능

//        JOptionPane.showMessageDialog(null, temp == cTemp && humidity == cHumidity);


        //코드정령 == 코드 포멧팅 ctrl + alt + l


        double d =123.5656712382913;
        System.out.println((int)d);
        System.out.printf("%.2f",d); // 소수 둘째 자리 반올림 표현

    }
}