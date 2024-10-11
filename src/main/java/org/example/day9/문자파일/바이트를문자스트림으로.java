package org.example.day9.문자파일;

import java.io.*;

public class 바이트를문자스트림으로 {
    public static void main(String[] args) {
        //글자를 써서 파일에 저장하고 싶어요 >>>> FileWriter를 사용
        //글자를 써서,네트워크로 전송해야한다
        //네트워크 전송은 1바이트 단위로 전송할 예정!
        //글자를 써서 바이트 배열로 변환후,바이트 배열을 바이트스트림으로 저장

        try { //파일 쓰기 String -->byte 변환 저장
            OutputStream os  = new FileOutputStream("/Users/jin-o/Downloads/kjo/newjava/data/data.txt");
            Writer w = new OutputStreamWriter(os,"UTF-8");
            w.write("hello");
            w.flush();
            w.close();
            os.close();
        } catch (Exception e) {
           e.printStackTrace();
        }
        //파일 읽어오기 (byte 단위로 전송됨.)
        try {
            InputStream is = new FileInputStream("/Users/jin-o/Downloads/kjo/newjava/data/data.txt");
            Reader r = new InputStreamReader(is);//문자 단위로 처리
            char[] data = new char[1024];
            int num =r.read(data);
            String s = new String(data,0,num);
            System.out.println(s);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//main
}//class
