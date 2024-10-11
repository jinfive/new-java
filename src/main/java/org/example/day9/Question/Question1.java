package org.example.day9.Question;

import java.io.*;

public class Question1 {
    public static void main(String[] args) throws IOException {
        //  /Users/jin-o/Downloads/kjo/newjava/data/data.txt 위치
        String originalFileName = "/Users/jin-o/Downloads/kjo/newjava/data/data.txt";
        String targetFileName = "/Users/jin-o/Downloads/kjo/newjava/data/data2.txt";

        InputStream is = new FileInputStream(originalFileName); //데이터를 읽어서
        OutputStream os = new FileOutputStream(targetFileName); //데이터를 쓴다

        byte[] data = new byte[1024];
        while (true) {
            int num = is.read(data);//읽어들인 바이트를 >> int로 변환
            if (num == -1) {
                break;
            }
            os.write(data, 0, num);
        }//while
        os.flush();
        os.close();
        is.close();


        /*
            is.transferTo(os);
          트라이 케치 쓰면 복사쉽다

         */

    }//main
}
