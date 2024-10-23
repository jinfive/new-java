package org.example.Day17.체팅프로그램;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class 메신저A extends JFrame {
    JTextArea list;
    메신저A() {
        //여기에 코드 다하면, static이 아니여서 더 좋은 코드를 만들 수 있음.
        System.out.println("생성자 시작.");

        setTitle("메신저A");

        setSize(500, 500);
        getContentPane().setBackground(Color.yellow);

       list = new JTextArea();
        JTextField input = new JTextField();
        setLayout(new BorderLayout());
        add(list, BorderLayout.CENTER);
        add(input, BorderLayout.SOUTH);
        //list->색, 세로 스크롤, 가로 글자넘어가는 것 방지, 글자크기 30으로 설정
        //input->색, 글자크기 30으로 설정
        list.setBackground(Color.yellow);
        Font font = new Font("굴림", Font.BOLD, 30);
        list.setFont(font);
        input.setBackground(Color.WHITE);
        input.setFont(font);
        list.setLineWrap(true); //글자많아지면 옆으로 벗어나지 않게!
        list.setAutoscrolls(true); //스크롤만드는 기능
        list.setEditable(false); //textarea에 입력 불가능
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        input.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //엔터치면 실행하고 싶은 내용을 써보자!
                        //input에 입력한 데이터를 가지고 와서
                        String data = input.getText();
                        //list 끝에 붙여보자
                        list.append("나>>>>"+ data+"\n");
                        input.setText("");
                        try {
                            DatagramSocket socket = new DatagramSocket();
                            byte[] data2 = data.getBytes();
                            InetAddress ip  = InetAddress.getByName("127.0.0.1");
                            DatagramPacket packet = new DatagramPacket(data2,data2.length,ip,8081);//보낸다
                            socket.send(packet);
                            socket.close();
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }

                    }
                }
        );

        //맨 끝!
        setVisible(true);
    }
    public void process() throws Exception {
        //소캣 생성
        //공간 byte[]만들기,packet만들어줌
        //받아라!
        DatagramSocket socket = new DatagramSocket(8080);//받는다
        while (true) {
            byte[] data = new byte[256];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            list.append("너>>>>" + new String(packet.getData()) + "\n");

        }
    }

    public static void main(String[] args) throws Exception {
        메신저A a = new 메신저A();
        a.process();
    }
}
