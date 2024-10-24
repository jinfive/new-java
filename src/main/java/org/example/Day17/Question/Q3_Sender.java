package org.example.Day17.Question;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Q3_Sender {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        byte[] buf = new byte[1024];
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("데이털 입력해주세요 x누르면 종료 됩니다.");
            String s = sc.nextLine();
            if(s.equals("x")){
                break;
            }
            else {
                buf = s.getBytes();
                InetAddress address = InetAddress.getByName("127.0.0.1");
                DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 8080);
                socket.send(packet);

            }
        }
        socket.close();


    }


}
