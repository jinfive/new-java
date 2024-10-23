package org.example.Day17.네트워크;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Udp받음 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8080);
        //공간 만들어두고 받을 준비를 해야한다
        //누군가가 IP와 POrt로 보내면 자동으로 받게해야한다.
        //여러번 받고 싶다면,무한 loop를 설정해야한다.
        //스트림 정송시 byte단위로 읽고 쓴다.
        //==> byte[] 배열로 데이터를 설정하면 됨.
        byte[] data = new byte[256];

        //보낼 때는 DataGramPacket으로 보냄.
        //받을 때도 DataGramPacket으로 보냄.
        DatagramPacket packet = new DatagramPacket(data, data.length);
        //패킷으로 받으면 데이터(데이타 그램)을 꺼내기 위해서 설정한 data배열에 넣어
        System.out.println("데이터 전송대기중>>>>>");
        socket.receive(packet);
        //현재까지 받은 데이터는 바이트 배열에 들어있어요.
        System.out.println(new String(data));
        socket.close();
    }
}
