package org.example.day16.Question;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Q2Server{
    public static void main(String[] args)throws Exception {
        ServerSocket server = new ServerSocket(8080);
        int count = 0;
        while(true){
            Socket socket = server.accept();
            count++;
            System.out.println(count + "클라이언트가 서버에 연결을 요청했습니다!!!");

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.print("나는 자바 프로그래머");
            out.flush();
            socket.close();
        }
    }
}
