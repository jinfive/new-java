package org.example.day8.class사용;

import javax.swing.*;
import java.io.*;
import java.util.Date;

public class 버퍼사용성는개선 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("/Users/jin-o/Downloads/kjo/newjava/data/data2024101015312.txt");
            Reader reader = new InputStreamReader(is);
            BufferedReader bufferedReader = new BufferedReader(reader);
           while(true){
               String line = bufferedReader.readLine();
               if(line == null){
                   break;
               }
               System.out.println(line);

           }
           is.close();
           reader.close();
           bufferedReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
