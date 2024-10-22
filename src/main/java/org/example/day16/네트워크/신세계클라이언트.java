package org.example.day16.네트워크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class 신세계클라이언트 {
    public static void main(String[] args) throws IOException {
        //ip + port
        for (int i =0 ;i<10;i++) {
            Socket client = new Socket("localhost",8080);
            System.out.println(i+">>>클라이언트가 접속함");
            BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            //buffet:임시 저장장치
            String s = reader.readLine();
            System.out.println("서버로부터 받은 데이터"+s);
        }
    }
}
