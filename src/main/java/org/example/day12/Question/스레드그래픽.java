package org.example.day12.Question;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class 스레드그래픽 extends JFrame {
    JLabel count, image, day;//전역변수, 아무데서나 접근이 가능!

    public 스레드그래픽() {
        setSize(700, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        count = new JLabel("카운트");
        image = new JLabel("이미지");
        day = new JLabel("시각");


        //폰트
        Font font = new Font("궁서", Font.BOLD, 50);
        count.setFont(font);
        image.setFont(font);
        day.setFont(font);

        //플로우 레이아웃
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        //JFrame에 끼워넣음
        add(count);
        add(image);
        add(day);
        Threadtime2 timer = new Threadtime2();
        ThreadString2 img = new ThreadString2();
        ThreadCount2 counter = new ThreadCount2();

        timer.start();
        img.start();
        counter.start();


        //마지막
        setVisible(true);
    }//생성자

    //--------------------------------------------------------------------------------------------------
    //클래스안 클래스 내부클래스
    //전역변수 공유할 목적!!!
    public class Threadtime2 extends Thread {


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        @Override
        public void run() {
            for (int i = 0; i < 300; i++) {
                LocalDateTime now = LocalDateTime.now();
                System.out.println(now.format(formatter));
                day.setText(now.format(formatter));
                try {
                    Thread.sleep(1000); //1초 1000 >>500 (0.5초)
                } catch (InterruptedException e) {
                    System.out.println("문제 발생");
                }
            }

        }
    }//시각 클래스 =>이너 클래스

    public class ThreadCount2 extends Thread {
        //필드
        //메서드 ->기능이 중요
        //묵시적public void run() >> 동시에 실행하고 싶은 내용
        //                            상속을 받아서 비어있는 상태
        // public void start{}
        //JVM은 실행 목록을 가지고 있음.
        //실행 할 것들들 실행목록에 리스트업해두고
        //스레드는 왔다갔다 하면서 조금씩 실행함.

        @Override
        public void run() {
            for (int i = 500; i > 0; i--) {
                if(i == 500){
                    Toolkit.getDefaultToolkit().beep();
                } else if (i == 1) {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(count, "시간이 끝났습니다", "경고", JOptionPane.WARNING_MESSAGE);
                    dispose();//Jframe닫음
                }
                count.setText(String.valueOf(i));
                System.out.println("카운터 감소>>>" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }//for
        }//run
    }//카운터 클래스

    public class ThreadString2 extends Thread {
        String[] movie = {"대도시의사랑.jpeg", "베테랑2.jpeg", "와일드로봇.jpeg", "조커.jpeg", "트랜스포머.jpeg"};

        @Override
        public void run() {
            for (int i = 0; i < movie.length; i++) {
                ImageIcon icon = new ImageIcon(movie[i]);
                image.setIcon(icon);

                System.out.println(movie[i]);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("문제 발생");
                }
            }
        }
    }//이미지클래스

}//class
