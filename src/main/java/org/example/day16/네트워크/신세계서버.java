package org.example.day16.네트워크;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class 신세계서버 {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8080);
        //1.서버가 start
        //ip는 컴퓨터 따라감
        int count = 0;
        while (true) {
            System.out.println("서버가 돌아갑니다");
            //2.요청이 들어오면 승인용 서버가 승인을 한다.
            //--> 연결 통로(Stream) 만들어진다.(socket)
            Socket socket =server.accept();
            count++;
            System.out.println("현재까지"+count+"승인이 떨어짐");
            //3. 보낼 데이터를 정하자.
            //스트림으로 연결된 데이터를 보낼수 있는 부품 PrintWriter
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            out.print("나는 java 프로그래머^^");
            out.flush();
            socket.close();
        }
    }
}
