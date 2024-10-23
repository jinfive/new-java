package org.example.Day17.체팅프로그램;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class 메신저B extends JFrame {
    JTextArea list;

    public 메신저B() {
        System.out.println("생성자 시작");
        setTitle("메신저B");
        setSize(500, 500);
        getContentPane().setBackground(Color.YELLOW);
        list = new JTextArea();
        JTextField input = new JTextField();
        setLayout(new BorderLayout());
        add(list, BorderLayout.CENTER);
        add(input, BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //색 넣기,세로 스크롤 ,가로 글자 넘어가는것 방지 ,글자 크기 30
        Font font = new Font("궁서", Font.BOLD, 30);
        input.setFont(font);
        list.setFont(font);

        list.getLineWrap();
        list.setLineWrap(true);
        list.setAutoscrolls(true);
        list.setEditable(false);
        list.setBackground(Color.green);
        input.setBackground(Color.red);

        input.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //엔터치면 실행하고 싶은 내용을 써보자!
                        //input에 입력한 데이터를 가지고 와서
                        String data = input.getText();
                        //list 끝에 붙여보자
                        list.append("나>>>>" + data + "\n");
                        input.setText("");
                        //입력한 내용을 상대방에게 보내자
                        try {
                            DatagramSocket socket = new DatagramSocket();
                            byte[] data2 = data.getBytes();
                            InetAddress ip  = InetAddress.getByName("127.0.0.1");
                            DatagramPacket packet = new DatagramPacket(data2,data2.length,ip,8080);//보낸다
                            socket.send(packet);
                            socket.close();
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }


                    }
                }
        );
        //맨 마지막
        setVisible(true);
    }

    public void process() throws Exception {
        //소캣 생성
        //공간 byte[]만들기,packet만들어줌
        //받아라!
        DatagramSocket socket = new DatagramSocket(8081);//받는다
        while (true) {
            byte[] data = new byte[256];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            list.append("너>>>>" + new String(packet.getData()) + "\n");

        }
    }

    public static void main(String[] args) throws Exception {
        메신저B m = new 메신저B();
        //메신저가 시작하자마자 무한루프로 받는거 들어가게 해야함.
        m.process();
    }
}
