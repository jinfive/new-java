package org.example.Day17.네트워크;

import java.net.*;

public class Udp보냄 {
    public static void main(String[] args) throws Exception {
        //보내는 전화기 역할 부붐---> DatagramSocket
        DatagramSocket socket = new DatagramSocket();
        //주소 ==> ip + port
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        //data는 String --->>>byte[]
        String s = "안녕하세요 저는 김진오 입니다,";
        byte[] data = s.getBytes();
        //패킷 --> DatagramPacket(데이터,주소)
        DatagramPacket packet = new DatagramPacket(data, data.length, ip, 8080);
        //소캣으로 패킷을 보내자
        socket.send(packet);
        //소켓 자원 해제
        socket.close();
    }
}
