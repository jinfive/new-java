package org.example.day8.class사용;

import java.io.*;

public class 출력2 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("/Users/jin-o/Downloads/kjo/newjava/data/imsi.txt");
            while (true) {
                int data = is.read();
                if (data == -1) break;
                System.out.println(data);


            }
            is.close();

        } //try
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //catch
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
