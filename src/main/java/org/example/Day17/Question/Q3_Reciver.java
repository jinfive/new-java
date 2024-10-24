package org.example.Day17.Question;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Q3_Reciver {
    public static void main(String[] args) throws Exception {
        System.out.println("받을 소켓 시작");
        while (true) {
            DatagramSocket socket = new DatagramSocket(8080);
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);

            System.out.println("받을 준비중");
            socket.receive(packet);
            System.out.println("데이터 받았어요!!");
            System.out.println("받은 데이터 "+new String(buf));
            socket.close();
        }

    }

}
