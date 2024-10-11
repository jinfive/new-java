package org.example.day8.class사용;

import java.io.*;

public class 출력3 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("/Users/jin-o/Downloads/kjo/newjava/data/imsi1.txt");
          byte[] data =new byte[100];

            while (true) {
                int num = is.read(data);
                if (num == -1) break;
                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);
                }


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
