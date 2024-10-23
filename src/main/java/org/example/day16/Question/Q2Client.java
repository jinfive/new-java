package org.example.day16.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Q2Client {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 111; i++) {
            Socket client =new Socket("localhost",8080);
            System.out.println("클라이언트 접속");
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String str = br.readLine();
            System.out.println(str);

        }
    }
}
